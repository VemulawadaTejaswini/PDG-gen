import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        StringBuilder sb = new StringBuilder(a);
        if(sb.reverse().toString().equals(b))System.out.print("YES");
        else System.out.println("NO");
    }
}
