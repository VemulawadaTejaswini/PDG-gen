import java.util.*;
import java.math.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        double b = Double.parseDouble(sc.next());
        b*=500;
        long c = (long)b;
        System.out.println(a*c/500);
    }
}