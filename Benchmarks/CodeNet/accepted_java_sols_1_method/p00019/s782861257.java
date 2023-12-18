import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long f = 1;
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            f = 1;
            for (int j = 1; j <= i; j++) {
                f *= j;
            }
        }
        System.out.println( f);
    }
}
