import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int i = 0;
            double m = 0, sum = 0, a = 0, b = 0;
            double[] rem;

            int n = sc.nextInt();
            if(n==0)
                break;

            rem = new double[n];
            
            for (i = 0; i < n; i++) {
                int num = sc.nextInt();
                rem[i] = num;
                sum += num;
            }

            m = sum / n;

            for (i = 0; i < n; i++) {
                b += (rem[i] - m) * (rem[i] - m);
            }
            a = Math.sqrt(b / n);

            System.out.println(a);
        }
    }
}

