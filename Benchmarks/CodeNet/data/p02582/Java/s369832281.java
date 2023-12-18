import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int r = 0;
        int max = 0;
        for (Character c : n.toCharArray()) {
            if (c == 'R') {
                r++;
            } else {
                max = Math.max(max, r);
                r = 0;
            }
        }
        System.out.println(Math.max(max, r));
	}
}