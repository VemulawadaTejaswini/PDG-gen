import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double d = in.nextDouble();
        int ans = 0;
        while(n-->0){
            double x = in.nextDouble();
            double y = in.nextDouble();
            if (Math.sqrt(x * x + y * y) <= d)
                ans++;
        }
        System.out.println(ans);
        in.close();
    }
}