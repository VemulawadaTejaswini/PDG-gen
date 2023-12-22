import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int V[] = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = s.nextInt();
        }
        int sum = 0;
        int diff = 0;
        for (int v: V) {
            diff = v - s.nextInt(); 
            if ((diff) > 0) {
                sum = sum + diff;
            }
        }
        System.out.println(sum);
    }
}