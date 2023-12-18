import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int prime[] = new int[1000000];
        int n;
        int count = 0;
 
        for (int i = 2; i <= 1000000 / 2; i++) {
            for (int j = i * 2; j < 1000000; j += i) {
                prime[j] = 1;
            }
        }
        while (sc.hasNext()) {
            n = sc.nextInt();
            count = 0;
            for (int i = 2; i <= n; i++) {
                if (prime[i] == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}