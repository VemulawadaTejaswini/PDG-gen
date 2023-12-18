import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        double max=0;
        while(n-->0) {
            double x=sc.nextDouble(),h=sc.nextDouble();
            max=Math.max(max,h/x);
        }
        System.out.println(max*m);
    }
}
