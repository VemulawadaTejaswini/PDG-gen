import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next().trim();
        String b = sc.next().trim();
        
        int len = b.length() - a.length();
        
        if (len == 1 && b.startsWith(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}