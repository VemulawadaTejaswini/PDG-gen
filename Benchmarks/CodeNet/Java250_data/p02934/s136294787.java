import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double[] arr = new double[n];

        for(int i = 0; i < n;i++){
            arr[i] = in.nextInt();
        }

        double sum = 0;

        for(int i = 0; i < arr.length;i++){
            sum += 1/arr[i];
        }

        System.out.println(1/sum);
    }
}