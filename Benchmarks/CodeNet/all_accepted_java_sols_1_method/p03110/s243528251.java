import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static ArrayList<Integer>[] rec;
    static int[] size, id;
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0.0, k = 380000.0;
        for(int i=0;i<n;i++){
            double mount = sc.nextDouble();
            String kind = sc.next();
            if(kind.equals("JPY")) ans += mount;
            else ans += k*mount;
        }
        System.out.println(ans);
    }
}