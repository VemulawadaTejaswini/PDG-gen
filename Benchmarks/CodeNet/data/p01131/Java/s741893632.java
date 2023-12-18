import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		String[] btn = new String[10];
		btn[1]=".,!? ";
		btn[2]="abc";
		btn[3]="def";
		btn[4]="ghi";
		btn[5]="jkl";
		btn[6]="mno";
		btn[7]="pqrs";
		btn[8]="tuv";
		btn[9]="wxyz";
		Scanner scn = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		int n = scn.nextInt();
		int[] b = new int[10];
		for(int k=1;k<=n;k++){
			b[k]=0;
			String tmp = scn.next();
			for(int s=0;s<tmp.length();s++){
				b[tmp.charAt(s)-'0']++;
				if(b[0]!=0){
					b[0]=0;
					for(int t=1;t<=9;t++){
						if(b[t]!=0){
							pr.print(btn[t].charAt((b[t]-1)%btn[t].length()));
							b[t]=0;
						}
					}
				}
			}
			pr.println();
		}
		pr.flush();
		scn.close();
	}

}