import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[]{"p", "p", "h", "b", "h", "h", "p", "h", "p", "h"};
        System.out.println(arr[in.nextInt() % 10] + "on");
    }
}