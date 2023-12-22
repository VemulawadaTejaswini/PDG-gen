import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        String s = sc.nextLine();
        for (Character c : s.toCharArray()) {
            if (c == '+') a++;
            else a--;
        }
        System.out.println(a);
    }
}