import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double result = 0;
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        result = Math.sqrt((x2 - x)*(x2 - x) + (y2 - y)*(y2 - y));
        System.out.println(result);
    }
}

