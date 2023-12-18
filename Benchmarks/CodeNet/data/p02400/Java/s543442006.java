package momoko1;
import java.util.Scanner;

public class helloworld{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI=Math.PI;
        double r = sc.nextInt();
        double s=PI*r*r;
        double R=2*PI*r;
        System.out.printf("%f %f\n",s,R);
    }
}
