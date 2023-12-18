import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double menseki=a*a*3.141592653/4;
                double enshuu=a*3.141592653;
                System.out.println(menseki+" "+enshuu);
    }
}