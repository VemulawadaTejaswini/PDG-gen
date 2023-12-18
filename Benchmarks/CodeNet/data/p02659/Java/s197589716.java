import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        sc.close();
        long c = (long) (b * 100);
        a *= c;
        System.out.println(a / 100);
    }
}