import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double inputData = sc.nextDouble();
        double result = Math.pow(inputData, 3);
        System.out.printf("%.0f\n", result);
        sc.close();
    }
}
