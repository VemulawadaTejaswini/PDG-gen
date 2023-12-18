import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count= 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int h = sc.nextInt();
            if(h>=max) count++;
            max = Math.max(h,max);
        }
            System.out.println(count);

    }
}
