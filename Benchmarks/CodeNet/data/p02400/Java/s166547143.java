import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double r = scan.nextDouble();
        
        double aoac = r * r * Math.PI;
        double cf = r + r * Math.PI;
        
        String after = String format("%.16f", aoac);
        String str = String format("%.16f", cf);
        
        System.out.println(after + " ", str);
    }
}