import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();
        long d = scan.nextInt();
        scan.close();
        long max = a * c;
        
        max = Math.max(max, a * d);
        max = Math.max(max, b * c);
        max = Math.max(max, b * d);

        System.out.println(max);
    }
    
}