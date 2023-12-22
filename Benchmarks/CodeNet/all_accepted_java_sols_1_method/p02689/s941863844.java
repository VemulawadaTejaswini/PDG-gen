import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N];
        int count = 0;
        boolean[] b = new boolean[N];
        for (int i = 0; i < N; i++) {
        	H[i] = sc.nextInt();
        }
        Set<int[]> set = new HashSet<>();
        for (int i = 0; i < M; i++) {
        	int[] ar = new int[2];
        	int A1 = sc.nextInt();
        	int B1 = sc.nextInt();
        	if (H[A1 - 1] < H[B1 - 1]) {
        		b[A1 - 1] = true;
        	} else if (H[A1 - 1] > H[B1 - 1]) {
        		b[B1 - 1] = true;
        	} else {
        		b[A1 - 1] = true;
        		b[B1 - 1] = true;
        	}
        }
        for (boolean bb: b) {
        	if (!bb) count++;
        }
        System.out.println(count);
    }
}