
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int n = sc.nextInt();
        int[] hw = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            hw[i] = sc.nextInt();
            sum += hw[i];
        }
        int result = days - sum;
        if (result >= 0){
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}
