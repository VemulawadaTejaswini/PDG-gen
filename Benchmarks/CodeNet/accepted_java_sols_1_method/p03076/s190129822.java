import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            int shortAmount = 10 - arr[i] % 10;
            if(shortAmount != 10) {
                sum +=shortAmount;
                max = Math.max(max, shortAmount);
            }
        }
        System.out.println(sum - max);
    }
}