import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(a*b);
        int c = a*2+b*2;
        System.out.println(" " + c);
    }
}
