import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] x = new double[(n)];
        double[] y = new double[(n)];

        double man = 0;
        for (int i = 0; n > i; i++) {
            man += Math.abs((x[i] - y[i]));
        }

        double euk = 0;
        for (int i = 0; n > i; i++) {
            euk += ((x[i] - y[i]) * (x[i] - y[i]));
        }

        double euk2 = Math.sqrt(euk);

        double sanj = 0;
        for (int i = 0; n > i; i++) {
            sanj += ((x[i] - y[i]) * (x[i] - y[i]) * (x[i] - y[i]));
        }

        double sanj2 = Math.pow(sanj, (1 / 3));
        
        double max=0;
        for (int i = 0; n > i; i++) {
            if(Math.abs(x[i]-y[i])>max){
                max=Math.abs(x[i]-y[i]);
            }
        }
        System.out.println(man);
        System.out.println(euk2);
        System.out.println(sanj2);
        System.out.println(max);

    }
}