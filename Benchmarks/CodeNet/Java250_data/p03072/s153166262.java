import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] hills = new int[n];
        for(int i = 0;i<n;i++) {
            hills[i] = in.nextInt();
        }
        int counter = 1;
        int cur = hills[0];
        for(int i = 1;i<n;i++) {
            if(hills[i]>=cur) {
                counter++;
                cur = hills[i];
            }
        }
        System.out.println(counter);
    }
}
