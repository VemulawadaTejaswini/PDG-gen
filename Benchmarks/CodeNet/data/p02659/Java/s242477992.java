import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
      	long aDouble = Long.parseLong(a);
      	double bDouble = Double.parseDouble(b) * 100;
      	long c = (long)((aDouble * bDouble)/100);
        System.out.println(c);
    }

}