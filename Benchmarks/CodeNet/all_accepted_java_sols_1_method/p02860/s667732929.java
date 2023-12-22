import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String str = sc.next();
        String s[] = str.split("");

        boolean judge = true;

        if (s.length % 2 == 1) {
            System.out.println("No");
        } else {

            for (int i = 0; i < s.length / 2; i++) {
                if (!(s[i].equals(s[s.length / 2 + i]))) {
                    judge = false;
                }
            }

            if (judge) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
	}
}
