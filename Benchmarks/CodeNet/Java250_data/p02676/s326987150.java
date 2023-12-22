import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next();
        int cnt = str.length();
        if (cnt<=num) {
			System.out.println(str);
		} else {
            String str2 = str.substring(0, num);
			System.out.println(str2+"...");
		}
        scan.close();
    }
}