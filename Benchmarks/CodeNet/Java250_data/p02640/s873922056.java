import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= x; j++) {
                if(i + j == x) {
                    int tmp = (i * 2) + (j * 4);
                    if(tmp == y) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }
        System.out.println("No");
    }
}