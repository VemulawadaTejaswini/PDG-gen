import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int div = a / b;
        int rem = a % b;
        double fp = (double)a / (double)b;
        
        String after = String.format("%.16f", fp);
        System.out.println(div + " " + rem + " " + after); 
    }
}