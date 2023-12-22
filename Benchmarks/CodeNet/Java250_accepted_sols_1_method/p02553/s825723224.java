
import java.util.Map.Entry;
import java.lang.reflect.Method;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayList;

//import org.w3c.dom.css.Counter;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //String S = sc.next();
        long a = Integer.parseInt(sc.next());
        long b = Integer.parseInt(sc.next());
        long c = Integer.parseInt(sc.next());
        long d = Integer.parseInt(sc.next());
        long ans = a*c;
        if(ans <b*c){
           ans =b*c;
        }
        if(ans <b*d){
            ans =b*d;
         }
         if(ans <a*d){
            ans =a*d;
         }
         System.out.println(ans);

    }
}