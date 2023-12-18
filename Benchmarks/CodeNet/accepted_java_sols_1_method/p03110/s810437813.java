import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double[] xi  =  new double[N];
        String[] ui  =  new String[N];
        for (int i=0; i<N; i++) {
            xi[i] = sc.nextDouble();
            ui[i] = sc.next();
        }

        double otoshidama  = 0;
        for (int i=0; i<N; i++) {
            if ("BTC".equals(ui[i])) {
                otoshidama += xi[i] * 380000;
            }
            else {
                otoshidama += xi[i];
            }
        }
        System.out.println(otoshidama);
    }
}