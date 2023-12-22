import java.util.Scanner;

/**
 * Created by DELL on 2017/7/1.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println(a+b+c-Math.max(Math.max(a,b),c));
    }

}