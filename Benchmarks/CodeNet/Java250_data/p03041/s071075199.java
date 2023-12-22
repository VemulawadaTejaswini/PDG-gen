import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        int k = in.nextInt() - 1;
        in.nextLine();
        char[] arr = in.nextLine().toCharArray();
        arr[k] = Character.toLowerCase(arr[k]);
        System.out.println(new String(arr));
    }
}
