import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] order = new int[N+1];
        for (int i = 1; i <= N; i++) {
        	order[sc.nextInt()] = i;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
        	sb.append(order[i]).append(" ");
        }
        System.out.println(sb);
    }
}