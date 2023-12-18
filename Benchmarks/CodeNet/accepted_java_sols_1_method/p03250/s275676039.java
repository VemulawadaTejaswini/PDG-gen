import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] xyz = br.readLine().split(" ");
        int x = Integer.parseInt(xyz[0]);
        int y = Integer.parseInt(xyz[1]);
        int z = Integer.parseInt(xyz[2]);
        int a = x * 10 + y + z;
        int b = x + y * 10 + z;
        int c = x + y + z * 10;
        if (a >= b && a >= c) {
            System.out.println(a);
        }
        else if ( b >= a && b >= c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}