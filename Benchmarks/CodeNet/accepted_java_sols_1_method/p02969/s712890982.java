
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        long ans = (long)3* (long)Math.pow(r,2);
        System.out.println(ans);
    }
}