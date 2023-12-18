import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = 0;
      if(n==10||n==100||n==1000||n==10000||n==100000){
      	System.out.println(10);
        return;
      }
      while(n>0){
      	sum+=n%10;
        n/=10;
      }
      System.out.println(sum);
    }
}