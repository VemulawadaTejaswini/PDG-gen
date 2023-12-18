import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Harry on 5/10/20.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        int res = Math.min(a, k) * 1;
        k-=a;
        if(k>0){
            k-=b;
        }
        if(k>0){
            res += Math.min(c, k)*-1;
        }
        System.out.print(res);
    }
}
