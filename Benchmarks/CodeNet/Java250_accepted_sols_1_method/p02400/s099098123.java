import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        double circleArea = r * r * Math.PI;
        double lengthOfCircumference = r * 2 * Math.PI;

        System.out.printf("%f %f", circleArea, lengthOfCircumference);
    }

}