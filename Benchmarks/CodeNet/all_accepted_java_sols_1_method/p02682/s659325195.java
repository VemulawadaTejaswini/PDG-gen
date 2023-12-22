import java.util.*;
  public class Main{
  	public static void main(String[]args){
    	Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int k = s.nextInt();
		
        if(a >= k){
          System.out.println(k);
        }else if(k <= a+b){
          System.out.println(a);
        }else {
          System.out.println(a-(k-a-b));
        }
    }
  }