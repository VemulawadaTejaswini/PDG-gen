import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       int t = scan.nextInt();
       int a = t / 500;
       int b = (t - a*500) / 5;
       System.out.println(a*1000+b*5);
    }
}