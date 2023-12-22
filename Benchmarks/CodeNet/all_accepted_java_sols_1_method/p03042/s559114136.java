import java.util.Scanner;
 
public class Main{
		
	public static void main(String args[]){
		  
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		
		int l = in/100;
		int r = in%100;
		
		if((r > 0 && r <= 12) && (l > 0 && l <= 12)) {
			System.out.println("AMBIGUOUS");
		}else if((l > 0 && l <= 12) && r >= 0) {
			System.out.println("MMYY");
		}else if((r > 0 && r <= 12) && l >= 0) {
			System.out.println("YYMM");
		}else {
			System.out.println("NA");
		}
		
	}
}
