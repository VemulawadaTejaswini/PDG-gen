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
        StringBuilder sb = new StringBuilder();
        for (int i : X) {
            if (i <= front) {
                sb.append(back + "\n");
            } else if (back <= i) {
                sb.append(front + "\n");
            }
        }
        System.out.println(sb);
    }    
}
