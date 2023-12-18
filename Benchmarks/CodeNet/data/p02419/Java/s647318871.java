import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        String t;
        int ans = 0;
        while(true) {
            t = sc.next();
            if(t.equals("END_OF_TEXT")) break;
            if(t.equalsIgnoreCase(w)) ans++;
        }
        System.out.println(ans);
    }
}
