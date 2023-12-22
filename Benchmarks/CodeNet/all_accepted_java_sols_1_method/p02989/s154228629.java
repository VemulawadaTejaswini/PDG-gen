import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        int d[] = new int[N+1];
        for(int i=1; i<=N; i++) {
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        System.out.println(d[N/2 + 1] - d[N/2]);
    }
}