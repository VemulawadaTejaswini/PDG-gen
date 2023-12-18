import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while((n = sc.nextInt()) != 0){
            double[] s = new double[n];
            double sum = 0.0;
            for(int i = 0; i < n; i++){
                s[i] = sc.nextDouble();
                sum += s[i];
            }
            double m = sum / n;
            double ssd = 0.0;
            for(int i = 0; i < n; i++){
                ssd += (s[i] - m) * (s[i] - m);
            }
            double sd = Math.sqrt(ssd / n);
            System.out.println(sd);
        }
    }
}

