import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		boolean result= false;
		int items= scan.nextInt();
		int popItems= scan.nextInt();
		int[] votes= new int[items];
		int count=0;
		for(int i=0; i<items; i++) {
			votes[i]= scan.nextInt();
			count+= votes[i];
		}
		int comp= (int)Math.ceil((1/(4*(double)popItems))*count);
		
		int finalCount=0;
		for(int i=0; i<votes.length; i++) {
			if(votes[i]>=comp) {
				finalCount++;
				if(finalCount>=popItems) {
					result= true;
					break;
				}
			}
		}
		if(result) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}