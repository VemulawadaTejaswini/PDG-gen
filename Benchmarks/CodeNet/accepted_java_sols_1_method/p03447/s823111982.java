import java.util.*;

public class Main{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int c = (X - A) / B;

        System.out.println(X - A - B * c);
    }
}