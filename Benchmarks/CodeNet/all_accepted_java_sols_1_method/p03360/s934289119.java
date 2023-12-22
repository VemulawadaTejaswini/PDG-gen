import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int k = sc.nextInt();
      int i = 1;
      while(i <= k){
        int max = Math.max(a,Math.max(b,c));
      	if(a==max)a = 2*a;
        else if(b==max)b = 2*b;
        else if(c==max)c = 2*c;
        i++;
      }
      System.out.println(a+b+c);
    }
}