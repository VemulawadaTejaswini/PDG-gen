import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s = scanner.next();
        StringBuilder sb = new StringBuilder();
        String ans = "Yes";
        int len = s.length();
        sb.append(s);
        if(!(sb.toString().equals(sb.reverse().toString()))) ans = "No";
        
        sb = new StringBuilder();
        sb.append(s.substring(0, ((len - 1) / 2)));
        if(!(sb.toString().equals(sb.reverse().toString()))) ans = "No";
        
        sb = new StringBuilder();
        sb.append(s.substring(((len + 3) / 2)-1, len));
        if(!(sb.toString().equals(sb.reverse().toString()))) ans = "No";
        
        System.out.println(ans);
    }
}