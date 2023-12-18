import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        char[] cs = sc.next().toCharArray();
        Arrays.sort(cs);
 
        if (cs[0] == cs[1] && cs[2] == cs[3] && cs[0] != cs[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}