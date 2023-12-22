import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1;i<=N;i++) {
            if (Math.floor((double)i*1.08)==N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }
}