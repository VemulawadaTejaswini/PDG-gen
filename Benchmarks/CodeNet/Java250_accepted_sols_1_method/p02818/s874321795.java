import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        int zero = 0;

        long left = A - K;
        if(A+B > K){
            if (left > 0) {
                System.out.printf("%d %d",left,B);
            } else {
                long left2 = B + left;
                System.out.printf("%d %d",zero,left2);
            }
        } else System.out.printf("%d %d",zero,zero);   
    }
}