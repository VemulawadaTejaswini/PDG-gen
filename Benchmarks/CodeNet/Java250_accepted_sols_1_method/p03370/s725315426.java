
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int moto = sc.nextInt();
        int[] cake = new int[N];
        int ans = 0;
        
        
       for (int i = 0; i < N; i++) {
		cake[i] = sc.nextInt();
		if(moto >= cake[i]) {
		moto -= cake[i];
		ans++;
		}
		}
       
       sc.close();
       Arrays.sort(cake);
       
       while(moto >= cake[0]) {
    	   moto -= cake[0];
    	   ans++;
       }
       System.out.println(ans);
    }
}