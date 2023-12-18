import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int k = Integer.parseInt(input.split(" ")[1]);

        String P = stdIn.nextLine();
        int[] p = new int[n];
        for(int i = 0 ; i < n ; i++){
            p[i] = Integer.parseInt(P.split(" ")[i]);
        }
        Arrays.sort(p);
        int ans = 0;
        for(int i = 0 ; i < k ; i++){
            ans += p[i];
        }
        System.out.println(ans);
    }
}