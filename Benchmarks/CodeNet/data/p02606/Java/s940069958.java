import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();

        int lnum = (l%d)==0 ? (l/d-1) : l/d;
        int ans = r/d - lnum;
        System.out.print(ans);
    }
}