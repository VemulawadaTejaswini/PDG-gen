import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        long a1 = (long)a*c;
        long a2 = (long)a*d;
        long a3 = (long)b*c;
        long a4 = (long)b*d;
        //System.out.println(a1+" "+a2+" "+a3+" "+a4+" ");
        System.out.println(Math.max(a1,Math.max(a2,Math.max(a3,a4))));
    }
}
