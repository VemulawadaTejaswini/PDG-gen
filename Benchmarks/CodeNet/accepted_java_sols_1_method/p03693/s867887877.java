import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s + sc.next();
        s= s + sc.next();
        int ans = Integer.parseInt(s);
        if(ans % 4 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
