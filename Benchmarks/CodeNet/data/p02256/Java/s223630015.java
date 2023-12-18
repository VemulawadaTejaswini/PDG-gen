import java.util.Scanner;

/**
 * Created by shoya on 2017/04/11.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(GCJ(sc.nextInt(), sc.nextInt()));
    }

    static int GCJ(int a, int b){
        if (a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b == 0)
            return a;
        else
            return GCJ(b, a % b);
    }

}