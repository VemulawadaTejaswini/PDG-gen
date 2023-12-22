import java.util.Scanner;
/**
 * 2018-04-08
 * https://beta.atcoder.jp/contests/abc082/tasks/abc082_a
 */
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = (a+b+2-1)/2;
        System.out.println(x);
    }
}
