
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(s.substring(0, 1)).append(s.length() - 2).append(s.substring(s.length() - 1, s.length())));
    }
}