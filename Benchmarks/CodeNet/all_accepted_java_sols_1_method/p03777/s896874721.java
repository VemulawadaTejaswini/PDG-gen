import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String ans = "D";
		
		if(a.equals(b)){
		    ans = "H";
		}
		System.out.println(ans);
    }
}
