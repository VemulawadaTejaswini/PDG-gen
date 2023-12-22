import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		String str = sc.next();
		
		String[] strs = str.split("");
		
		StringBuffer sbfirst = new StringBuffer();
		StringBuffer sbend = new StringBuffer();
		
		for(int i=0; i<2; i++) {
			sbfirst.append(strs[i]);
		}
		for(int i=2; i<4; i++) {
			sbend.append(strs[i]);
		}
		int firstint = Integer.parseInt(sbfirst.toString());
		int endint = Integer.parseInt(sbend.toString());
		
		if(firstint<=12 && endint<=12 && firstint != 0 && endint != 0) {
			System.out.println("AMBIGUOUS");
		}else if(firstint > 12 && endint>0 && endint <=12) {
			System.out.println("YYMM");
		}else if(endint >12 && firstint<=12 && firstint != 0) {
			System.out.println("MMYY");
		}else if(firstint >12 && endint == 0) {
			System.out.println("NA");
		}else if(endint >12 && firstint == 00) {
			System.out.println("NA");
		}else if(firstint <=12 && firstint !=0 && endint == 0) {
			System.out.println("MMYY");
		}else if(endint <= 12 && endint != 0 && firstint == 0) {
			System.out.println("YYMM");
		}else if(endint ==0 && firstint ==0) {
			System.out.println("NA");
		}else if(firstint >12 && endint > 12) {
			System.out.println("NA");
		}
	}
}
