import java.util.Scanner;

/**
 * 2018-04-08
 * https://beta.atcoder.jp/contests/abc085/tasks/abc085_a
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //System.out.println(s.replaceAll("2017","2018"));
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(3,'8');
        System.out.println(sb);

    }
}
