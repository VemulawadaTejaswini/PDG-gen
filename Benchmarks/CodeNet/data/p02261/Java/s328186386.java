import java.io.*;

class Main
{
 
  public static void main(String[] args)
  {
	  boolean rowNumber[] = new boolean[10];
    try{
    	// ??\???????????????
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // ????????°???????????????
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] array = new int[n];
 
      // ???????????£?????¨
      int numbers[] = new int[10];
      for(int i = 0; i < n; i++){
    	  // ??°?????????
        array[i] = Integer.parseInt(str[i].substring(1));
        numbers[array[i]]++;
      }
      
      // double?????§??????
      for(int i = 0;i < 10;++i){
    	  if(numbers[i] >= 2){
    		  rowNumber[i] = true;
    	  }
      }
      
      // bubble
      String str1[] = str.clone();
      bubbleSort(str1,n);
      String stable = "Stable";
      for(int i = 1;i < 10;++i){
    	  if(rowNumber[i]){
    		  if(!isRow(str1,str,i)){
    			  stable = "Not stable";
    			  break;
    		  };
    	  }
      }
      System.out.println(stable);
      
      // selectionsort
      String str2[] = str.clone();
      selectionSort(str2,n);
      stable = "Stable";
      for(int i = 1;i < 10;++i){
    	  if(rowNumber[i]){
    		  if(!isRow(str2,str,i)){
    			  stable = "Not stable";
    			  break;
    		  };
    	  }
      }
      System.out.println(stable);
      
    }catch(Exception e){
      System.out.println(e);
    }
  }
 
  public static boolean isRow(String[] str1,String[] str2,int number){
	  char[] row1 = new char[4];
	  int num1 = 0;
	  char[] row2 = new char[4];
	  int num2 = 0;
	  // ????????°????????????????????????
	  for(int i = 0;i < str1.length;++i){
		 if(Integer.parseInt(str1[i].substring(1)) == number){
			 row1[num1] = str1[i].charAt(0);
			 num1++;
		 }
		 
		 if(Integer.parseInt(str2[i].substring(1)) == number){
			 row2[num2] = str2[i].charAt(0);
			 num2++;
		 }
	  }
	  
	  for(int i = 0;i < num1;++i){
		  if(row1[i] != row2[i]){
			  return false;
		  }
	  }
	  return true;
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
  
  public static void selectionSort(String[] str, int N)
  { 
    for(int i = 0; i < N; ++i){
    	int mini = i;
    	for(int j = i + 1;j < N;++j){
    		if(Integer.parseInt(str[j].substring(1)) < Integer.parseInt(str[mini].substring(1))){
    			mini = j;
    		}
    	}
    	if(mini != i){
			final String tmp = str[i];
			str[i] = str[mini];
			str[mini] = tmp;
    	}
    }
	  StringBuilder sb = new StringBuilder();
	  for(int i = 0;i < N;++i){
		  sb.append(str[i]);
		  if(i + 1 < N){
			  sb.append(" ");
		  }
	  }
	  System.out.println(sb.toString());
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
  
  public static void bubbleSort(String[] str,final int N){
	  // 2??????????????°???
	  for(int i = 0;i < N - 1;++i){
		  for(int j = N - 1;j > i;--j){
			  if(Integer.parseInt(str[j].substring(1)) < Integer.parseInt(str[j - 1].substring(1))){
				  final String tmp = str[j];
				  str[j] = str[j - 1];
				  str[j - 1] = tmp;
			  }
		  }
	  }
	  //show(A);
	  StringBuilder sb = new StringBuilder();
	  for(int i = 0;i < N;++i){
		  sb.append(str[i]);
		  if(i + 1 < N){
			  sb.append(" ");
		  }
	  }
	  System.out.println(sb.toString());
  }
  
  public static void bubbleSort(int[] A,int N){
	  for(int i = 0;i < N - 1;++i){
		  for(int j = N - 1;j > i;--j){
			  if(A[j] < A[j - 1]){
				  final int tmp = A[j];
				  A[j] = A[j - 1];
				  A[j - 1] = tmp;
			  }
		  }
	  }
	  show(A);
  }
}