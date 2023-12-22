import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        for (int i=0;i<N;i++) {
            int A = sc.nextInt();
            H-=A;
            if (H<=0) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}