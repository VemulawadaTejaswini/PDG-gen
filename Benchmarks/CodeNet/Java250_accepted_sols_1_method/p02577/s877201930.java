import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str = sn.next();
        String[] strArray = new String[str.length()];
        long sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum = sum + Long.parseLong(String.valueOf(str.charAt(i)));
        }
        if (sum % 9 == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
