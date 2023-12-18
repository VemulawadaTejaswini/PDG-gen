import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println(String.format("%.6f", a*a*Math.PI) + " " + String.format("%.6f", (a+a)*Math.PI));
    }
}

