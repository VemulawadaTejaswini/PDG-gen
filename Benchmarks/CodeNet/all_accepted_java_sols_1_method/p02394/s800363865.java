import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(w >= x+c && x-c >= 0 && h >= y+c && y-c >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

