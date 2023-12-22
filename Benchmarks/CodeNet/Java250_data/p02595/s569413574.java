import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int x[] = new int[n];
        int y[] = new int[n];
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

            double xd = Math.pow(x[i], 2);
            double yd = Math.pow(y[i], 2);


            // System.out.println("x:" + x[i] + " y:" + y[i] + " sqrt:" + Math.sqrt(xd + yd));
            if(Math.sqrt(xd + yd) <= d) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}