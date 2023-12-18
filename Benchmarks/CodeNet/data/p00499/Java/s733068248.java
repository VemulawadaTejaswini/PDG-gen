import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int jAll = sc.nextInt();
        int mAll = sc.nextInt();
        int jEach = sc.nextInt();
        int mEach = sc.nextInt();
        System.out.println(n - Math.max((jAll + jEach - 1) / jEach, (mAll + mEach - 1) / mEach));
    }
}

