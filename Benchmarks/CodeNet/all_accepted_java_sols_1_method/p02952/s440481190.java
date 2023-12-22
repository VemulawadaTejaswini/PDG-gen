import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < 10) {
            System.out.println(N);
        } else if (N < 100) {
            System.out.println(9);
        } else if (N < 1000) {
            System.out.println(9 + N - 99);
        } else if (N < 10000) {
            System.out.println(9 + (999 - 100 + 1));
        } else if (N < 100000) {
            System.out.println(9 + (999 - 100 + 1) + N - 9999);
        } else {
            System.out.println(9 + (999 - 100 + 1) + (99999 - 10000  +1));
        }
    }
}