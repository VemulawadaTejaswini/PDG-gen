import java.util.*;
public class Main {
    public void solve() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = N%1000;
        if(A  == 0)System.out.println(0);
        else System.out.println(1000-A);

    }

    public static void main(String[] args) {
        new Main().solve();
    }
}