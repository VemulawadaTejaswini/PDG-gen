import java.util.Scanner;

/**
 * Created by on 2018/1/8.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        String substring = str.substring(4);
        System.out.println("2018"+substring);
    }
}