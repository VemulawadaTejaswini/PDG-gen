import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x < y){
            int tmp = y;
            y = x;
            x = tmp;
        }

        System.out.println(GCD(x, y));
    }

    static int GCD(int a, int b){
        if(a == 0)
            return b;
        else
            return GCD(b % a, a);
    }
}

