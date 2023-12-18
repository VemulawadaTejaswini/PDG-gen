import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        String B = sc.next();
        long B100 = (B.charAt(0)-'0')*100 + (B.charAt(2)-'0')*10 +(B.charAt(3)-'0');
        System.out.println(Math.floor(A*B100/100));
    }
}
