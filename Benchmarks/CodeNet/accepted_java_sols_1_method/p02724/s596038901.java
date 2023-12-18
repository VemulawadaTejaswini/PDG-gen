import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int num = X/500;
        int r = X%500;
        r/=5;
        System.out.println(num*1000+r*5);
    }
}