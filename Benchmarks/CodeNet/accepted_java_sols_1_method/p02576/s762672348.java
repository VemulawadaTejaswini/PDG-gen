import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();

        System.out.println((int)Math.ceil(n / (double) x) * t );

    }
}
