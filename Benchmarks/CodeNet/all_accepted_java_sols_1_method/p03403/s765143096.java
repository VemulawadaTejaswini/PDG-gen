import java.util.*;
 
public class Main {
 
	static Main instance = new Main();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int[] a = new int[N+1];
        a[0] = 0;
        int price = 0;
        
        for(int i = 1; i < N+1 ; i++){
          a[i] = sc.nextInt();
          price += Math.abs(a[i]-a[i-1]);
        }
        price += Math.abs(0-a[N]);
      
        int h = price;
        for(int i = 1; i+1 < N+1; i++){
          price = h;
          int tmp1 = Math.abs(a[i]-a[i-1]);
          int tmp2 = Math.abs(a[i+1]-a[i]);
          int tmp3 = Math.abs(a[i+1]-a[i-1]);
          price = price -tmp1-tmp2+tmp3;
         
          System.out.println(price);
        }
          
        int last = 0;
        for(int i = 1; i < N; i++){
          last += Math.abs(a[i]-a[i-1]);
        }
        last += Math.abs(0-a[N-1]);
        System.out.println(last);
	}
}