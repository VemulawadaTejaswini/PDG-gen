import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		while(n-- > 0){
			String s = scan.nextLine();
			if(s.matches("^>'(=+)#\\1~$")) System.out.println("A");
			else if(s.matches("^>\\^(Q=)+~~$")) System.out.println("B");
			else System.out.println("NA");
		}
	}
}