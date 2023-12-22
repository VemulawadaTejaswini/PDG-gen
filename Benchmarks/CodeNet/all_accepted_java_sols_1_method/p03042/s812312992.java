import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		
	
		boolean isYM=true,isMY=true;
		
		int left = Integer.parseInt(S.substring(0, 2));
		int right = Integer.parseInt(S.substring(2,4));
		
		if(left>12) {
			isMY = false;
		}
		
		if(right>12){
			isYM = false;
		}
		
		if(left==0){
			isMY = false;
		}
		
		if(right==0) {
			isYM = false;
		}
		
		
		if(isMY&&isYM) {
			System.out.println("AMBIGUOUS");
		}else if(isMY&&!isYM){
			System.out.println("MMYY");
		}else if(!isMY&&isYM){
			System.out.println("YYMM");
		}else if(!isMY&&!isYM){
			System.out.println("NA");
		}
		
	}
}