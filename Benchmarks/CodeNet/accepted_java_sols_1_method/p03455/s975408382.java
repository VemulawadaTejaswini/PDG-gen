import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int c = a*b;
        if (c%2 == 1){
            System.out.println("Odd");
        }
        else if(c%2 == 0){
            System.out.println("Even");
        }
        
    }
}