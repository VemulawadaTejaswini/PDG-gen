import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        String s[] = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = str.substring(i, i+1);
        }
        s[k-1] = s[k-1].toLowerCase();

        for (int i = 0; i < n; i++) {
            System.out.print(s[i]);
        }
        System.out.println();
	}
}