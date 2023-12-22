import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int max = 0;
        int cnt = 0;
        for(int i = 0; i<N; i++) {
        	x[i] = sc.nextInt();
        }
        int wk = 0;
        for (int i = 0; i<N; i++) {
        	wk = x[i];
        	while(wk % 2 == 0) {
        		wk = wk / 2;
        		cnt++;
        	}
        }
        System.out.println(cnt);
    }
}