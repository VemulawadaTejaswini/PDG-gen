import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(gcd(x, y));
    }

    public static int gcd(int x, int y){
        int X = x, Y = y;
        if(X < Y) {
            X = y;
            Y = x;
        }
        if(X % Y == 0)
            return Y;
        else
            return gcd(Y, X % Y);
    }

}
