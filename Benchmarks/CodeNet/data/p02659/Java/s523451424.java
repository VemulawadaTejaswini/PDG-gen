import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
      	double aDouble = Double.parseDouble(a);
      	double bDouble = Double.parseDouble(b);
      	double c = aDouble * bDouble;
        System.out.println((int)c);
    }

}