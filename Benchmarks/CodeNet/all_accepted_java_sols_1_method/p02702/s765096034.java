import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder strBul = new StringBuilder(str).reverse();
		String[] ar = strBul.toString().split("");
		int mod = 2019;
		int[] a_array = new int[str.length()];
		int[] ruiseki = new int[str.length()+1];
		int[] ten_mod = new int[str.length()];
		ten_mod[0] = 1;
 		for(int i=1;i<str.length();i++) {
 			ten_mod[i]=ten_mod[i-1]*10%mod;
		}
 		for(int i=0;i<str.length();i++) {
 			a_array[i] = Integer.parseInt(ar[i])*ten_mod[i]%mod;
		}
 		for(int i=0;i<str.length();i++) {
 			ruiseki[i+1] = (a_array[i]+ruiseki[i])%mod;
		}
 		int[] cnts= new int[2019];
 		for(int i=1;i<str.length()+1;i++) {
// 			System.out.println(ruiseki[i]);
 			cnts[ruiseki[i]]++;
 		}
 		long ans=0;
 		for(int i=0;i<2019;i++) {
 			if (cnts[i]>1) {
 				ans+=cnts[i]*(cnts[i]-1)/2;
 			}
 		}
 		ans += cnts[0];
 		System.out.println(ans);
	}

}
