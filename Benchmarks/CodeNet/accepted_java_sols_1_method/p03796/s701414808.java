import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long m = 1;
      long k = (long) Math.pow(10,9)+7;
      for(int i = 1;i <= n;i++){
      	m *= i;
        m = m%k;
      }
      System.out.println(m);
    }
}
