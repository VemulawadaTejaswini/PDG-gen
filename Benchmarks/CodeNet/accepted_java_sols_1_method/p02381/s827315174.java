import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        while (a !=0) {
            double[] b = new double[a];
            for (int x = 0; x < a; x++) {
                b[x] = scan.nextInt();
            }
            double average = 0;
            for (int x = 0; x < a; x++) {
                average = average +b[x];
            }
            average = average / a;
            double var = 0;
            for (int x = 0; x < a; x++) {
                var = var +  ((b[x] - average) *(b[x] - average));
            }
            var = var /a;
            System.out.printf("%.8f\n",Math.sqrt(var));
            a = scan.nextInt();
        }

    }
}
