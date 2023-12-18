import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        int tmp = 0;

        tmp = X;
        X = Y;
        Y = tmp;

        tmp = X;
        X = Z;
        Z = tmp;

        System.out.println(X + " " + Y + " " + Z);
    }
}