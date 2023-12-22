import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();
        int ans = 0;
        if(A*C > B) {
            ans = B/A;
        } else {
            ans = C;
        }
        System.out.println(ans);
        scn.close();
    }
}