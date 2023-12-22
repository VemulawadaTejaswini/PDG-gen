import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[3];

        count[0] = sc.nextInt();
        count[1] = sc.nextInt();
        count[2] = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        
        if (count[0] >= k) {
            sum = k;
        } else if (count[0] + count[1] >= k) {
            sum = count[0];
        } else {
            sum = count[0] - (k - (count[0] + count[1]));
        }
        
        System.out.println(sum);
    }
}