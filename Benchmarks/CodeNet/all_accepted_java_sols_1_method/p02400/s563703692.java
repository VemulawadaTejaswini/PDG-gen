import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
		System.out.printf("%.6f %.6f\n", Math.PI * r * r, Math.PI * r * 2);
}

}

