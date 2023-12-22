import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < s1.length(); i++) {
            sb.append('x');
        }
        System.out.println(sb);
    }
}