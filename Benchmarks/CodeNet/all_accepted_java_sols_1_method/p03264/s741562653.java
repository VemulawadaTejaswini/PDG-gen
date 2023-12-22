import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int odd = 0;
        int eve = 0;
        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                eve++;
            } else {
                odd++;
            }
        }
        System.out.println(eve * odd);
    }
}

