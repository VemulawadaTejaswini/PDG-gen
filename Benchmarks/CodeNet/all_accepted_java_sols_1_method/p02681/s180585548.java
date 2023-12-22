import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        int cnt1 = str1.length();
        String str3 = str2.substring(0, cnt1);
        if (str1.equals(str3)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
        scan.close();
    }
}