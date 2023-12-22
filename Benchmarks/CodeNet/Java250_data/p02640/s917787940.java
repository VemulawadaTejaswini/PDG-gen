import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        for(int i=0; i<=x; i++) {
            for(int j=0; j<=x-i; j++) {
                if(y == 2*i + 4*j && x == i + j) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
    }
}
