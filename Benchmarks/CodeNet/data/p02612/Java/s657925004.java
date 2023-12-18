import java.util.*;
class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
            int N = scan.nextInt();
            int change  = Integer.MIN_VALUE;
           if(N % 1000 == 0) {
               change = 0;
           } else {
                int rem = N / 1000;
                change = (rem + 1) * 1000 - N;
            }
            System.out.println(change);
    }
}
