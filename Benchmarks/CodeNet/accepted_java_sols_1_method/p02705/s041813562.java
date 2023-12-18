import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        int r=tan.nextInt();
        double p=2*Math.PI*r;
        System.out.printf("%.20f\n",p);
    }
}
