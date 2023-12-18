
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mae=sc.nextInt();
		int ato=sc.nextInt();

		String moji=sc.next();
		String[] aa=moji.split("-");
		if(aa.length==2 && aa[0].length()==mae && aa[1].length()==ato) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}