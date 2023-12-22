import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String s = kbd.next();
        String[] arr = s.split("");
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            if (arr[i].equals(arr[i + 1])) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}