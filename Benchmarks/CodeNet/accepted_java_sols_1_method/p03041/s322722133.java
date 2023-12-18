import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int k = kbd.nextInt();
        String temp = kbd.next();
        String[] arr = temp.split("");
        arr[k - 1] = arr[k - 1].toLowerCase();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}