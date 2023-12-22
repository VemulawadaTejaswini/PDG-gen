import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
        int[] a = new int[N+2];
        a[0] = 0;
        a[N+1] = 0;
        int cnt = 0;
        for (int i = 1; i < N+1; i++) {
            a[i] = sc.nextInt();
            cnt += Math.abs(a[i] - a[i-1]); 
        }
        cnt += Math.abs(a[N+1] - a[N]);
        for (int i = 1; i < N+1; i++) {
            int tmp = cnt - Math.abs(a[i+1] - a[i]) - Math.abs(a[i]- a[i-1]) + Math.abs(a[i+1]- a[i-1]);
            System.out.println(tmp);
        }
    }

}