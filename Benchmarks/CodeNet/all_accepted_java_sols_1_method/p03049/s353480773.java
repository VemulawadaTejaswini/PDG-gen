import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String s;
		int length = 0;
		int leftB = 0;
		int rightA = 0;
		int numAB = 0;
		int lr = 0;
		for(int i = 1; i <= N; i++){
			s = sc.nextLine();
			length = s.length();
			if(s.substring(0,1).contentEquals("B")) {
				leftB ++;
				if(s.substring(s.length()-1,s.length()).contentEquals("A")) {
					rightA ++;
					lr ++;
				}
			}
			else if(s.substring(s.length()-1,s.length()).contentEquals("A")) {
				rightA ++;
			}
			
			s = s.replace("AB", "X");
			numAB += length - s.length();
		}
		//System.out.println(numAB);
		//System.out.println(leftB);
		//System.out.println(rightA);
		//System.out.println(lr);
		
		if(leftB == rightA) {
			if(lr != leftB || leftB == 0) {
				System.out.println(numAB + leftB);
			}else {
				System.out.println(numAB + leftB-1);
				}	
		}else {
			System.out.println(numAB + Math.min(leftB,  rightA));
		}
	}
}