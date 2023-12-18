import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[100001];
        long sum = 0;
        for (int i = 0; i < N; i++) {
        	int n = sc.nextInt();
        	sum += n;
        	num[n]++;
        }
        int Q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
        	int target = sc.nextInt();
        	int change = sc.nextInt();
        	int d = change-target;
        	sum += num[target]*d;
        	num[change] += num[target];
        	num[target] = 0;	
        	sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}