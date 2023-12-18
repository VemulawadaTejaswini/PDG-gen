import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int k = 1;
      for(int i = 0;i < n;i++){
        a[i]=sc.nextInt();
        if(a[i]%2==0)k*=2;
      }
      System.out.println((int)Math.pow(3,n)-k);
    }
}