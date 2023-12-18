import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double cur = 2*Math.PI*radius;
        System.out.printf("%.6f %.6f",area, cur);
    }
}
