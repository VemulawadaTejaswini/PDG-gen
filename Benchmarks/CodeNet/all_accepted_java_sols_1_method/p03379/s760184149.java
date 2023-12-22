import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }
        int[] Xclone = X.clone();
        Arrays.sort(Xclone);
        int front = Xclone[N/2-1];
        int back = Xclone[N/2];
        for (int i : X) {
            if (i <= front) {
                System.out.println(back);
            } else if (back <= i) {
                System.out.println(front);
            }
        }
    }    
}
