import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        long a = in.nextLong(), b = in.nextLong();
        if (a >= b) {
            a = a % b;
        }
        if (a > b - a)
            System.out.println(b - a);
        else {
            System.out.println(a);
        }
    }
}
