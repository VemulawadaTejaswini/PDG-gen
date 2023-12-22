import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] ans = new int[N];
        for (int i = 0; i < N-1; i++){
            int index = input.nextInt();
            ans[index-1] += 1;
        }
        for (int i = 0; i < N; i++){
            System.out.println(ans[i]);
        }
    }
}