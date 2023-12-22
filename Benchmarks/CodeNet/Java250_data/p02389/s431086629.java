import java.io.IOException;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String text = String.format("%s %s", a * b, 2*a + 2*b);
        System.out.println(text);
    }
}