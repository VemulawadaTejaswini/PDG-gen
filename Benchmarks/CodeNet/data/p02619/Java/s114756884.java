import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int c[]=new int[26];
		int s[][] = new int[D][26];
		int t[]=new int[D];
		for (int i = 0; i < 26; i++) {
			c[i]=sc.nextInt();
		}
		for (int i = 0; i < D; i++) {
			for (int j = 0; j < 26; j++) {
				s[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < D; i++) {
			t[i]=sc.nextInt();
		}
		int mannzokudo = 0;
		int last[]=new int[26];
		for (int i = 0; i <26; i++) {
			last[i]=0;
		}
		for (int d = 1; d <D+1; d++) {
			mannzokudo=mannzokudo+s[d-1][t[d-1]-1];
			last[t[d-1]-1]=d;
			for (int j = 0; j < 26; j++) {
				mannzokudo=mannzokudo-c[j]*(d-last[j]);
			}
			System.out.println(""+mannzokudo);
		}
	}
}