import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        byte n = scanner.nextByte();
        System.out.println(n+(n*n)+(n*n*n));
    }
}
