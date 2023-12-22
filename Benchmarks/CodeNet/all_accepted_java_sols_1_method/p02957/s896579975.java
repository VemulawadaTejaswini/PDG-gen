import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double k = (a+b)/2d;
        if (Math.floor(k)==k)System.out.println((int)k);
        else System.out.println("IMPOSSIBLE");
    }
}
