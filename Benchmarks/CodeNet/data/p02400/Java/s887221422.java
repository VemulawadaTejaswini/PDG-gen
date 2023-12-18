import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        double nagasa = 2 * Math.PI * r;
        
        System.out.print(String.format("%.6f %.6f", area,nagasa));
    }
}
