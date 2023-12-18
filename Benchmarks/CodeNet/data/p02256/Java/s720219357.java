import java.io.*;

class Main
{
 
  public static void main(String[] args)
  {
    try{
    	// ??\???????????????
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // ????????°???????????????
      //int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] array = new int[2];
 
      for(int i = 0; i < 2; i++){
        array[i] = Integer.parseInt(str[i]);
      }
      System.out.println(String.valueOf(getGraterValue(array[0],array[1])));
 
    }catch(Exception e){
      System.out.println(e);
    }
  }
 
  public static int getGraterValue(int a,int b){
	  int greaterValue = a > b ? b : a;
	  for(int i = greaterValue;i > 1;--i){
		  if(a % i == 0 && b % i == 0){
			  return i;
		  }
	  }
	  
	  return 1;
  }
}