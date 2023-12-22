import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] t = new int[n+1];
      int[] x = new int[n+1];
      int[] y = new int[n+1];
      for(int i = 1;i <= n;i++){
      	t[i]=sc.nextInt();
        x[i]=sc.nextInt();
        y[i]=sc.nextInt();
      }
      for(int i = 0;i <= n-1;i++){
      	int k = Math.abs(x[i+1]-x[i])+Math.abs(y[i+1]-y[i]);
        if(t[i+1]-t[i]<k||(t[i+1]-t[i])%2!=k%2){
        	System.out.println("No");
            return;
        }
      }
      System.out.println("Yes");
    }
    public static int lcm(int x, int y){
      return x*y/gcd(x,y);
    }
    public static int gcd(int x, int y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}