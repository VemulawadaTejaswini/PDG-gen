import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long[] arr = new long[(int) n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int i=0; i<arr.length; i++)
        {

             if (arr[i]%5==0)
                arr[i] = 0;

            else if (arr[i]%3==0)
                arr[i] = 0;

        }

        long sum = Arrays.stream(arr).sum();

        System.out.println(sum);


    }
}