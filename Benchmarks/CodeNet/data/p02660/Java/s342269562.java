import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();

        int count = 0;
        for(int z = 2; z <= n; z++) {
            if(n % z == 0) {
                count++;
                n /= z;
            }
        }
        System.out.println(count);
    }
}
