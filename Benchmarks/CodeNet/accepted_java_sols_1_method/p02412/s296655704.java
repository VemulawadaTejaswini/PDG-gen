import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n + x == 0) {
                return;
            }

            int counter = 0;

            for (int i=1; i<n-1; ++i) {
                for (int j=i+1; j<n; ++j) {
                    for (int k=j+1; k<n+1; ++k) {
                        if (i + j + k == x) {
                            counter += 1;
                        }
                    }
                }
            }
            System.out.println(counter);
        }
    }
}
