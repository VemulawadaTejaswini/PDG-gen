
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		scan.close();
		if(S.length()==1) {
			System.out.println(S);
			return;
		}
		int[] N = new int[S.length()];

		int patternCount = 1;
		String tmpBit = "";
		for(int i=0; i<N.length; i++) {
			N[i] = Integer.parseInt(String.valueOf(S.charAt(i)));
			if(i>0) {
				patternCount*=2;
				tmpBit = tmpBit + "1";
			}
		}

		long sum=0;
		for(int i=0; i<patternCount; i++) {
			String bin = Integer.toBinaryString(i);
			while(bin.length()<tmpBit.length()) {
				bin = "0" + bin;
			}
			String add = String.valueOf(N[0]);
			for(int j=0; j<bin.length(); j++) {
				if(bin.charAt(j)=='1') {
					sum+=Integer.parseInt(add);
					add = "";
				}
				add = add + N[j+1];
			}
			if(add.length()>0) {
				sum+=Long.parseLong(add);
			}
		}
		System.out.println(sum);

	}

}
