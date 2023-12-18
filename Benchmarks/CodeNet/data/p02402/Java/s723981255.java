import java.io.*;
 
class Main {
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
 
    String line[] = br.readLine().split(" ");
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int sum = 0;
    int ai;
    
      for(int i = 0; i < n; i++){
    	  ai = Integer.parseInt(line[i]);
    	  if(ai < min)  min = ai;
    	  if(ai > max)  max = ai;
    	  sum += ai;
      }
      
      System.out.println(min +" "+ max +" "+ sum);
  }
}