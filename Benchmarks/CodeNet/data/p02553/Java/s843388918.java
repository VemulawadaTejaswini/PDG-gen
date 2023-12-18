import java.io.*;
class Main{
  public static long solution(int x[]){
    long max = Long.MIN_VALUE;
    if(x[0] > 0 && x[1] > 0 && x[2] > 0 && x[3] > 0)
        return x[1] * x[3];
    if(x[0] < 0 && x[1] > 0 && x[2] > 0 && x[3] > 0)
        return x[1] * x[3];
    if(x[0] < 0 && x[1] < 0 && x[2] > 0 && x[3] > 0)
        return (long)(Math.min(x[2], x[3]) * Math.max(x[0], x[1]));
        
    if(x[0] > 0 && x[1] > 0 && x[2] < 0 && x[3] < 0)
        return (long)(Math.min(x[0], x[1]) * Math.max(x[2], x[3]));
    if(x[0] > 0 && x[1] > 0 && x[2] < 0 && x[3] > 0)
        return x[1] * x[3];
    if(x[0] < 0 && x[1] > 0 && x[2] < 0 && x[3] > 0)
        return (long)(Math.max(x[1] * x[3], x[0] * x[2]));
        
    return (long)(Math.min(x[1], x[2]) * Math.min(x[2], x[3]));
  }
 
public static void main(String[] args) throws Exception{
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		    String str[]=buff.readLine().split(" ");
		    int arr[]=new int[4];
		    for(int i=0;i< 4;i++)
		        arr[i]=Integer.parseInt(str[i]);
	    System.out.println(solution(arr));
	}
}