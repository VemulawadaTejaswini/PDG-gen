import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int S = a*b;
        int l = (2*a) + (2*b);

        System.out.println(S + " " + l);
    }
}