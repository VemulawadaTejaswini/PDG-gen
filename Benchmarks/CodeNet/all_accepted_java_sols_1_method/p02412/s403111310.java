import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int a = 0;
            if (n == 0 && x == 0)
                break;
            int i, j, k;
            for (i = x / 3; i <= n; i++) {
                for (j = 1; j < i; j++) {
                    for (k = 1; k < j;k++) {
                        if (i + j + k == x)
                            a++;
                    }
                }
            }
            System.out.println(a);
        }
    }
}
                    

        
