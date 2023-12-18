import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int sum=0;
		while(!a.equals("0")){
			int digit = a.length();
			for(int i=0;i<digit;i++){
				sum+=a.charAt(i)-'0';
			}
			System.out.println(sum);
			sum=0;
			a=scan.next();
		}
	}

}