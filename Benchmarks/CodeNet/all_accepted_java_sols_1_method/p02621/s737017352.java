import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();

        System.out.println(a+(int)Math.pow(a,2)+(int)Math.pow(a,3));
    }
}
