import java.util.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = sc.next();

        int countR = 0;
        for (int i = 0; i < n; i++) {
            if (c.charAt(i) == 'R') {
                countR++;
            }
        }

        int needMove = 0;
        for (int i = 0; i < countR; i++) {
            if (c.charAt(i) == 'W') {
                needMove++;
            }
        }

        System.out.println(needMove);
	}
}