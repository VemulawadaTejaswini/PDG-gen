import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Long value = 1L;
        int count = 0;
        while (true) {
            value++;
            if (N%value == 0) {
                N /= value;
                count++;
            }
            if (N < value) {
                break;
            }
        }
        System.out.println(count);
    }
}
