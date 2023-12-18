import java.util.Scanner;

class Aoj10026 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for (int n = input.nextInt(); n != 0; n = input.nextInt()){
            int[] s = new int[n];
            double m = 0;

            for (int i = 0; i < n; i++){
                s[i] = input.nextInt();
                m += s[i];
            }
            m /= n;

            double alpha = 0;
            for (int i = 0; i < n; i++){
                alpha += (s[i] - m) * (s[i] - m) / n;
            }
            System.out.printf("%.6f\n", Math.sqrt(alpha));
        }
    }
}