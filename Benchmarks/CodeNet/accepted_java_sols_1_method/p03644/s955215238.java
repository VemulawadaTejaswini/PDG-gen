import java.util.Scanner;

/**
 * Created by Echizen on 2017/5/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(Integer.highestOneBit(num));
    }
}