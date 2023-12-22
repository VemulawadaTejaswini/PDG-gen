import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ret = -1;
        for (int i = 1; i <= 10000; i++) {
            int a = (int)(i*0.08);
            int b = (int)(i*0.1);
            if (a == A & b == B) {
                ret = i;
                break;
            }
        }
        System.out.println(ret);
    }
}