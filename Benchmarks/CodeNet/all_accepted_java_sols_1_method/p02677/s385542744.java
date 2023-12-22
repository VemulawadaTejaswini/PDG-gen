import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        double hDegree = (h*60+m)*0.5;
        double mDegree = m*6;
        double degree = Math.abs(hDegree-mDegree);

        double ans = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(degree)));
        System.out.println(ans);

    }
}
