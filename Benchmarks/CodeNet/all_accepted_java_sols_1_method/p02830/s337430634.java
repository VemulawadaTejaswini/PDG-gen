import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = sc.nextInt();

        String s = sc.next();
        String t = sc.next();
        String result = "";

        while(i < n)
        {
            result += s.charAt(i);
            result += t.charAt(i);
            i++;
        }

        System.out.println(result);

    }
}
