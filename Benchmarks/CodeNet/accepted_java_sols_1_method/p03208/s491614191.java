import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[]tree = new int[N];

        for (int i = 0; i < N; i++) {
			tree[i] = sc.nextInt();
		}
        sc.close();
        Arrays.sort(tree);
        int min = tree[N-1];
        
        for (int i = 0; i < N-M+1; i++) {
        	int a = 0;
        	a = tree[i+M-1] - tree[i];
        	min = Math.min(a,min);
        	if(min == 0) break;
		}
        System.out.println(min);
    }
}