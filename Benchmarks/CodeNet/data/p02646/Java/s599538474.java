import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                long A = scan.nextLong();
                long V = scan.nextLong();
                long B = scan.nextLong();
                long W = scan.nextLong();
                long T = scan.nextLong();

                scan.close();

                boolean isCatch = false;

                long distance;

                if (A > B) {
                	distance = A - B;
                } else {
                	distance = B - A;
                }

                long hayasaNoSa = V - W;

                if (distance <= hayasaNoSa * T) {
                	isCatch = true;
                }

                if (isCatch) {
                	System.out.println("YES");
                } else {
                	System.out.println("NO");
                }

        }

}