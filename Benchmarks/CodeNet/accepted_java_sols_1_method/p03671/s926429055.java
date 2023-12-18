import java.util.*;



/**
 * Created by santa on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[3];
        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();
        Arrays.sort(a);

        System.out.println(a[1] + a[0]);
    }




} // MainClass
