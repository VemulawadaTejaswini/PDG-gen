import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(b.substring(0, b.length()-1).equals(a)) System.out.println("Yes");
        else System.out.println("No");
    }
}