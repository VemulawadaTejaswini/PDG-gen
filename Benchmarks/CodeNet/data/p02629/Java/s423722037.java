import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> arr = new ArrayList<Character>();
        long x = sc.nextLong();
        for(int i=1;i<30;i++){
            if(x==0)break;
            arr.add((char)(96 + x % 26));
            x /= 26;
        }
        StringBuilder sb = new StringBuilder();
        for(Character c:arr)sb.append(c);
        System.out.println(sb);
    }
}
