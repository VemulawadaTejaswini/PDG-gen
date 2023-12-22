import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a = Short.parseShort(sc.next());
        short b = Short.parseShort(sc.next());
        if((a*b) % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
