import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long X, Y;
        X = sc.nextLong();
        Y = sc.nextLong();
        //B=sc.nextInt();
        long num = 1, num2 = X;
        while (true) {
            num2 *= 2;
            if (num2 <= Y) num++;
            else break;
        }
        System.out.println(num);
    }
}