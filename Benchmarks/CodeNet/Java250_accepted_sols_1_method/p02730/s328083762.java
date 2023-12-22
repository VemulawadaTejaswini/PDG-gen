import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean isStrong = true;

		if(S.length() % 4 == 1) {
			int l = (S.length()-1 )/ 2;
			for(int i = 0; i < l/2 ; i++) {
				if(S.charAt(i) != S.charAt(l-i-1)) isStrong = false;
			}
			if(!S.substring(0, l).equals( S.substring(l+1))) isStrong = false;
		}else {
			int l = (S.length()-1 )/ 2;
			for(int i = 0; i < (l-1)/2 ; i++) {
				if(S.charAt(i) != S.charAt(l-i-1)) isStrong = false;
			}
			if(!S.substring(0, l).equals( S.substring(l+1))) isStrong = false;
			
		}

		if(isStrong) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}




	}
}
