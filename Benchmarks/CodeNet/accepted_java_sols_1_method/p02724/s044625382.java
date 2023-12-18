import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fh = n / 500;
        int left = n % 500;
        int f = left / 5;
        System.out.println(fh * 1000  + f * 5);
    }
}