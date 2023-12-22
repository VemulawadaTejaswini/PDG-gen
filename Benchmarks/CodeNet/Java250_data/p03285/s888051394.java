import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 7 != 0) {
            for (int k = n; k >= 0; k = k - 4) {
                if (k % 7 == 0) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");

        } else {
            System.out.println("Yes");
        }


    }

}


