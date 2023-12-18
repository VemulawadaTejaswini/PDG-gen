import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String p = sc.nextLine();
        for (int i = 0; i <= t.length() - p.length(); i++){
            int a = i;
            int b = 0;
            while (b < p.length()) {
                if ((t.charAt(a) == p.charAt(b)) && (b != p.length() - 1)){
                    a++;
                    b++;
                }
                else if ((t.charAt(a) == p.charAt(b)) && (b == p.length() - 1)){
                    System.out.println(i);
                    b = p.length();
                }
                else {
                    b = p.length();
                }
            }
        }
    }
}
