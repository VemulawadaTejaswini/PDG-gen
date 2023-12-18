import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int count = 0;

        while(N-- != 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            long dist = (long)((long)x * (long)x + (long)y * (long)y);
            if(dist <=  ((long)D * (long)D)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
