import java.io.*;
import java.util.*;
public class Main {
    static int[] dp, a;
    static int m, L;
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int a = sc.nextInt(), b =sc.nextInt(), c = sc.nextInt();
        boolean flag = a==b&&a==c;
        String ans = flag?"Yes":"No";
        System.out.println(ans);
    }
}