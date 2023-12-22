
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        char[] c = sc.next().toCharArray();

        int res = 0;

        for(int i=0; i<n; i++) {
            char x = a[i];
            char y = b[i];
            char z = c[i];
            if(x == y && y == z) continue;
            if(x == y || y == z || z == x) {
                res ++;
                continue;
            }
            res += 2;
        }

        System.out.println(res);
    }

}
