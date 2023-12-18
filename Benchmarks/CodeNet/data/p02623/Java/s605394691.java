import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int []a = new int[n + m];
        for(int i = 0; i < a.length; i++)
            a[i] = input.nextInt();

        Arrays.sort(a);
        int sum = a[0];
        int j = 0;
        for( ; j < a.length && sum <= k; j++){

                sum += a[j];


        }
        System.out.println(j);
    }
}
