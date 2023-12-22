import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int n = s.length();
		
		char lr[] = new char[n];
		
		lr[0] = 'R';
		for (int i = 1 ; i <n-1 ; i ++) {
			
			lr[i] = s.charAt(i);
		}
		
		lr[n-1] = 'L';
		
		int ch[] = new int [n];
		for(int i = 0 ; i < n ; i ++) {
			ch[i] = 0;
		}
		
		/*左から、Lが出現する場所を探す。
		 * その場所の左に、Rがいくつあるか数える。
		 * その場所から右に、次のRが出現するまでに、Lがいくつ続くか数える。
		 * Rの出た場所から、、、、一行目に戻る。
		 * 
		 */
		int i  = 0;
		
		while (i < n-1) {
			
		
		int count_R = 0;
		int count_L = 0 ;
		while(lr[i] == 'R') {
			
			i ++;
			count_R ++;
		}
		
		while(lr[i] == 'L' && i <n-1) {
		
			i++;
			count_L++;
		}
		
		if (i == n-1) {
			count_L ++;
			i++;
		}
		int type_A = count_R/2 + (count_L+1)/2;
		int type_B = count_R + count_L - type_A;
		
		ch[i-count_L] += type_A;
		ch[i-count_L-1] += type_B;
		
		}
		
		for ( int pp = 0 ; pp <n ; pp ++) {
			
			System.out.print(ch[pp]+" ");
		}
	}
}
