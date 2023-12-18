import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int la = a.length();
        int lb = b.length();

        for (int i = 0; i < (la-lb+1);i++){
            String c = a.substring(i,i+lb);
            int cu = 0;
            for (int j = 0; j<lb;j++){
                if (c.charAt(j) != b.charAt(j))
                    cu++;
            }
            arr.add(cu);
        }
        System.out.println(Collections.min(arr));
    }
}