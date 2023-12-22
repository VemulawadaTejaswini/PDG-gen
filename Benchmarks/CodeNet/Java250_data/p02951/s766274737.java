import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner my_scanner = new Scanner(System.in);
        int A = my_scanner.nextInt();
        int B = my_scanner.nextInt();
        int C = my_scanner.nextInt();
        int a_empty = A - B;
        int c_remain = C - a_empty;
        if(c_remain < 0) {
          c_remain = 0;
        }
        System.out.print(c_remain);
    }
}
