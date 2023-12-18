import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();

        int times;
        if(n%x == 0) times = n / x;
        else times = n / x + 1;

        System.out.println(t * times);
    }
}
