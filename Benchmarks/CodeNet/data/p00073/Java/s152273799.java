import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            double x=sc.nextDouble();
            double h=sc.nextDouble();
            if(x==0&&h==0) {
                break;
            }
            System.out.println(Math.sqrt(h*h+x*x/4)*x*2+x*x);
        }
    }
}
