import java.util.*;
public class Main {
	public static void main(String[] args){
		String az = "abcdefghijklmnopqrstuvwxyz";
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] someString = new String[n];
		for (int i=0;i<n;i++) {
			someString[i] = scan.next();
		}
		
		int hitCount=0;
		int saveCount=-1;

		// check a-z
		for (int i=0;i<az.length();i++) {
			// check strings
			for (int l=0;l<someString.length;l++){
				// check character in string
				for (int j=0;j<someString[l].length();j++) {
					if (someString[l].charAt(j) == az.charAt(i)) {
						hitCount++;
					}
				}
				if (saveCount == -1 || saveCount > hitCount) {
					saveCount = hitCount;
				}
				hitCount = 0;
			}
			for (int m=0;m<saveCount;m++){
				System.out.print(az.charAt(i));
			}
			saveCount = -1;
		}
	}
}