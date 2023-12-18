import java.io.*;

class Main
{
 
  public static void main(String[] args)
  {
    try{
    	// ??\???????????????
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // ????????°???????????????
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] array = new int[n];
 
      for(int i = 0; i < n; i++){
        array[i] = Integer.parseInt(str[i]);
      }
      selectionSort(array, array.length);
 
    }catch(Exception e){
      System.out.println(e);
    }
  }
 
  public static void selectionSort(int[] A, int N)
  {
    int swapNum = 0;
 
    for(int i = 0; i < N; ++i){
    	int mini = i;
    	for(int j = i + 1;j < N;++j){
    		if(A[j] < A[mini]){
    			mini = j;
    		}
    	}
    	if(mini != i){
    		++swapNum;
			final int tmp = A[i];
			A[i] = A[mini];
			A[mini] = tmp;
    	}
    }
    
    System.out.print(show(A));
    System.out.println(Integer.valueOf(swapNum));
  }
 
  public static String show(int[] B)
  {
    StringBuilder sb = new StringBuilder();
 
    for(int i = 0; i < B.length; i++){
      sb.append(B[i]).append(" ");
    }
    sb.deleteCharAt(sb.length() - 1);
    sb.append("\n");
 
    return sb.toString();
  }
}