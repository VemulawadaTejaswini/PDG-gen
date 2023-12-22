import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static Scanner sc;
    public static Pattern pt;
    public static void main(String[] args) throws Exception {
        pt = Pattern.compile("^.+$");
        sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            System.out.println(s.replace("Hoshino", "Hoshina"));
        }
    }
}