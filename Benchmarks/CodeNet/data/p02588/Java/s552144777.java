import java.util.*;
public class Main {
	public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] numbers = new double[N];

        for (int i = 0; i < N; i++) {
            double x = sc.nextDouble();
            numbers[i] = x;
        }

        int count = 0;
        for (int i = 0; i < N; i++) {

            for (int j = i + 1; j < N; j++) {

                double a = numbers[i];
                double b = numbers[j];
                double x = a * b;
                if (!(a != 0 && x / a != b)) {
                    if (x == Math.round(x)) {
                        count++;
                    }
                }

            }
        }      

	}
}