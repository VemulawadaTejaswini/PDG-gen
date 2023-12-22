import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long h = sc.nextLong();
        
        System.out.println((long)Math.pow(2, Long.toBinaryString(h).length()) - 1);
    }

}
