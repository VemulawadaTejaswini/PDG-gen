import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        String b = sc.next();

        long B = 0;
        B += b.charAt(0) - '0';
        B *= 10;
        B += b.charAt(2) - '0';
        B *= 10;
        B += b.charAt(3) - '0';


        long res = (long) (A * B / 100);
        //long res = (A * (long)(B * 100)) / 100;

        System.out.println(res);
    }
}

/*
999999999999999 9.99
 */