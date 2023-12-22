import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int a = X/500;
        int r = X%500;
        System.out.println(a*1000+r/5*5);
    }
}

