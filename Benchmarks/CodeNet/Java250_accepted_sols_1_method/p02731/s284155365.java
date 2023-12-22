import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        sc.close();
        double ans = 0;
        ans = (l*l*l)/27;
        System.out.println(String.format("%.12f",ans));
    }
}