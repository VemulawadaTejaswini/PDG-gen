import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        int array = scan.nextInt();
        String huruf = scan.next();
        String haraf = huruf.substring(array-1, array).toLowerCase();
        System.out.println(huruf.substring(0, array-1)+haraf+huruf.substring(array, loop));
    }
}
