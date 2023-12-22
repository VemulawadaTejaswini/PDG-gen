import java.util.Scanner;
 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        String s = sc.next();
        String s2 = sc.next();
        System.out.println((s + s).contains(s2) ? "Yes" : "No");
    }
}
