import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] sl = new String[2];
        int a = sc.nextInt();
        int b = sc.nextInt();
        Arrays.fill(sl,"");
        for(int i = 0; i < b; i++){
            sl[0] += a;
        }
        for(int i = 0; i < a; i++){
            sl[1] += b;
        }
        Arrays.sort(sl);
        System.out.println(sl[0]);
    }
}
 