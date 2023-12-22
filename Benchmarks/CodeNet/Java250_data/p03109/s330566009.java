import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.charAt(5)=='0'&&(s.charAt(6)=='1'||s.charAt(6)=='2'||s.charAt(6)=='3'||s.charAt(6)=='4')){
			System.out.println("Heisei");
		}else{
			System.out.println("TBD");
		}
	}
}