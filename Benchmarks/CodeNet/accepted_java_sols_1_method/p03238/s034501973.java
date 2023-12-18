import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i == 1) System.out.println("Hello World");
        else System.out.println(scanner.nextInt() + scanner.nextInt());
    }
}