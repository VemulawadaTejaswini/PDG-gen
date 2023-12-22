import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        // ?????\??°???
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int answer = arr[1] - arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - min > answer) {
                answer = arr[i] - min;
            }
            min = Math.min(min, arr[i]);
        }
        System.out.println(answer);

    }

}