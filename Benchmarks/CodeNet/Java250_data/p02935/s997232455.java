import java.util.*;
 
class Main {	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
        	v[i] = sc.nextInt();
        }
        Arrays.sort(v);
        double x = (v[0] + v[1]) / 2.0;
        for (int i = 2; i < N; i++) {
        		x = (v[i] + x) / 2;
        	}
        System.out.println(x);
    }
}