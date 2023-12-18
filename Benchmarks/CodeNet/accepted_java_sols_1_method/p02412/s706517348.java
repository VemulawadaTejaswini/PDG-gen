import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int n = sc.nextInt();
        int x = sc.nextInt();
        while (!(n == 0 && x == 0)) {
            for (int a = 1; a <= n - 2; a++) {
                for (int b = a + 1; b <= n - 1; b++) {
                    for (int c = b + 1; c <= n; c++){
                        if((a + b + c) == x) {
                            counter++;
                            break;
                        }
                    }
                }
            }
            System.out.println(counter);
            counter = 0;
            n = sc.nextInt();
            x = sc.nextInt();
        }
    }
}

