import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int buff1 = 0,buff2 = 0;

		buff1 = Integer.parseInt(s.substring(0,1));
		if(buff1>=1) {
			buff1 = Integer.parseInt(s.substring(0,2));
		}else {
			buff1 += Integer.parseInt(s.substring(1,2));
		}

		buff2 = Integer.parseInt(s.substring(2,3));
		if(buff2>=1) {
			buff2 = Integer.parseInt(s.substring(2,4));
		}else {
			buff2 += Integer.parseInt(s.substring(3,4));
		}

		if(buff1>0 && buff1<=12) {
			if(buff2>0 && buff2<=12) {
				System.out.println("AMBIGUOUS");
			}else {
				System.out.println("MMYY");
			}
		}else if(buff2>0 && buff2<=12) {
			System.out.println("YYMM");
		}else {
			System.out.println("NA");
		}
	}
}


