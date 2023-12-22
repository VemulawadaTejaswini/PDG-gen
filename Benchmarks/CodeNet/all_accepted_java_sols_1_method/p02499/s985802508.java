import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		ArrayList<Double> reslt=new ArrayList<Double> ();
		Scanner in=new Scanner(System.in);
		String alp_s="abcdefghijklmnopqrstuvwxyz";
		int alp_i[]=new int[26];
		for (int l=0;l<26;l++) {
			alp_i[l]=0;
		}
		while (in.hasNext()) {
			String str=(in.next()).toLowerCase();
				for (int i=0;i<str.length();i++) {
					for (int j=0;j<26;j++) {
						if (str.charAt(i) == alp_s.charAt(j)) {
							alp_i[j]++;
						}
					}
				}
		}
			for (int k=0;k<26;k++) {
				System.out.printf("%c : %d%n",alp_s.charAt(k),alp_i[k]);
			}
	}
}