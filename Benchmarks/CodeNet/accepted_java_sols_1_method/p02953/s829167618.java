import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "Yes";
        int[] H = new int[n];
        Arrays.setAll(H, i -> Integer.parseInt(sc.next()));
        for(int i = n-1; i > 0; i--) {
            if(H[i-1] > H[i]) H[i-1]--;
            if(H[i-1] > H[i]) {
                ans = "No"; break;
            }
        }
        System.out.println(ans);
    }
}
