import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int r = 0;
        double circle_area = 0.0;
        double circumference = 0.0;

        double pi = 3.14159275;

        Scanner sc= new Scanner(System.in);

        r = sc.nextInt();

        circle_area = 2 * pi * r;
        circumference = pi * r * r;


        System.out.println( circle_area + " " + circumference);
        sc.close();
    }

}

