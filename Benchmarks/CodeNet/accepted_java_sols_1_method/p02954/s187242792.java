import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String S = scan.next();
			char[]s = new char[S.length()];
			s = S.toCharArray();
			
			int []goukei = new int[S.length()];
			int []R = new int[S.length()];
			int []L = new int[S.length()];
			
			int Rcount = 0;
			for(int i = S.length()-1;i>=0;i--) {
				if(s[i]=='L') {
					Rcount = 0;
					R[i] = Rcount;
				}else if(s[i] =='R') {
					Rcount++;
					R[i] = Rcount;
				}	
			}
			
			for(int i = 0;i<S.length();i++) {
				if(R[i]!=0) {
					if(R[i]%2==0) {//偶数
						goukei[i+R[i]]++;
					}else{//奇数
						goukei[i+R[i]-1]++;
					}
				}
			}
			
			
			int Lcount = 0;
			for(int i = 0;i<S.length();i++) {
				if(s[i]=='R') {
					Lcount = 0;
					L[i] = Lcount;
				}else if(s[i] =='L') {
					Lcount++;
					L[i] = Lcount;
				}	
			}
			
			for(int i = 0;i<S.length();i++) {
				if(L[i]!=0) {
					if(L[i]%2==0) {//偶数
						goukei[i-L[i]]++;
					}else{//奇数
						goukei[i-L[i]+1]++;
					}
				}
			}
			
			for(int i = 0;i<S.length();i++) {
				System.out.print(goukei[i]);
				System.out.print(" ");
			}
			
			
			
		}
	}
}
