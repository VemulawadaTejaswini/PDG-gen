import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int re = 0;
      for(int i = 1;i <= n;i++){
        int sum = 0;
        int x = i;
        while(x != 0){
        	sum += x%10;
            x = x/10;
        }
        if(a <= sum&&sum <= b)re += i;
        sum = 0;
      }
      System.out.println(re);
    }
}