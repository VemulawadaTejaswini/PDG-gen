import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double mean = sum;
        mean /= N;

        int avg = (int) Math.round(mean);

        int price = 0;
        for(int i : arr){
            price += (avg - i) * (avg - i);
        }

        System.out.println(price);

    }
}
