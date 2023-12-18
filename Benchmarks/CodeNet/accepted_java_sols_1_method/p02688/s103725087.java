import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Set<Integer> is = new HashSet<>();
        int count = 0;
        for (int i = 0; i < K; i++) {
        	int d = sc.nextInt();
        	for (int j = 0; j < d; j++) {
        		is.add(sc.nextInt());
        	}
        }
        for (int i = 1; i <= N; i++) {
        	if (!is.contains(i)) {
        		count++;
        	}
        }
        System.out.println(count);
    }
}