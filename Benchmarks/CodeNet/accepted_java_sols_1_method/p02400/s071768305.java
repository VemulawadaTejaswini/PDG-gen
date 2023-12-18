import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();


        System.out.printf("%f%s%f", Math.PI * r * r, " ", Math.PI * r * 2);


    }

}
