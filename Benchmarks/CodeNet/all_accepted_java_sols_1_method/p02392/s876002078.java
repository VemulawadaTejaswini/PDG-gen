import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        String result = null;
        if (a < b && b < c) { result = "Yes"; }
        else { result = "No"; }
        
        System.out.println(result);
    }
}
