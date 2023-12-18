import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        if((a * b) % 2 == 0){
            System.out.print("No");
        }else{
            System.out.print("Yes");
        }
    }
}