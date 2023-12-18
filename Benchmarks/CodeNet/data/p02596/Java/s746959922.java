import java.util.*;

public class Main{

    final static Scanner sc = new Scanner(System.in);
    static int res = 0;
    public static void main(String[] args) {
        System.out.println(C());
    }

    public static int C(){
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            res = (res*10+7)%N;
            if (res == 0) {
                return i;
            }
        }
        return -1;
    }
}
