import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] A = new double[N];
        double sum = 0;
        
        for (int i=0; i<N; i++) {
            A[i] = sc.nextDouble();
        }
        
        for (int j=0; j<N; j++) {
            sum += 1/A[j];
        }
        
        System.out.println(1/sum);
        
    }
}