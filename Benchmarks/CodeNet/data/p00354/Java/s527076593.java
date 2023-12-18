import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] s=new String[7];
		s[0]="thu";
		s[1]="fri";
		s[2]="sat";
		s[3]="sun";
		s[4]="mon";
		s[5]="tue";
		s[6]="wed";
		
		System.out.println(s[scan.nextInt()%7]);
	}
}

