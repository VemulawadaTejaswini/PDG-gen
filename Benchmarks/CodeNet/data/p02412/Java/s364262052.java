import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count;

        int n = sc.nextInt();
        int x = sc.nextInt();

        while (true) {
            if (n == 0 && x == 0) {
                break;
            }

            count = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    for (int k = 1; k <= n; k++) {
                        if (i == j || j == k || k == i) {
                            continue;
                        }else if(i + j + k == x){
                            count++;      
                        }
                    }
                }
            }

            count /= 6;
            System.out.println(count);

            n = sc.nextInt();
            x = sc.nextInt();
        }

        sc.close();
    }
}
