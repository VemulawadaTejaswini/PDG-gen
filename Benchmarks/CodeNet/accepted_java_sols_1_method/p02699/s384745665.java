import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S=sc.nextInt(),W=sc.nextInt();

        System.out.println(S>W?"safe":"unsafe");
    }
}