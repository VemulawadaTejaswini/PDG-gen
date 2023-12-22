import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean isDistinct = true;
        for(int i = 1; i < N; i++) {
            if(arr[i] == arr[i-1]) {
                isDistinct = false;
                break;
            }
        }
        if(isDistinct) System.out.println("YES");
        else System.out.println("NO");
    }
}
