import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[1000];
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for(int i = 0;i < 1000;i++)
            num[i] = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++)
            num[i] = scanner.nextInt();
        Arrays.sort(num);
        int sum = 0;
        for(int i = 0;i < k ;i++)
            sum += num[i];
        System.out.println(sum);


    }
}
