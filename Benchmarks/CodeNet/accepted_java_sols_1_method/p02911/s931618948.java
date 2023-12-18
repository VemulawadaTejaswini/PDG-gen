import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int a[] = new int[q];
        for (int i = 0; i < q; i++) {
            a[i] = sc.nextInt();
        }

        int sum[] = new int[n];
        for (int i = 0; i < q; i++) {
            sum[a[i]-1]++;
        }

        for (int i = 0; i < n; i++) {
            if (q - sum[i] < k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
	}
}
