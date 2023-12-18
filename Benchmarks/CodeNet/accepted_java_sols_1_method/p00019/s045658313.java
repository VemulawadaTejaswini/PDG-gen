import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        long a=1L;
        for (int n=(new Scanner(System.in)).nextInt(); n>0; a*=n--);
        System.out.println(a);
    }
}