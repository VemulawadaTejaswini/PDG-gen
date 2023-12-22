import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int c[] = new int[26];
		for(int i=0; i<c.length;i++){
			c[i] = 0;
		}
		for(int i=0;i<S.length();i++){
			c[(int)S.charAt(i)-97]++;
		}
		for(int i=0; i<c.length; i++){
			if(c[i]==0) {
				System.out.println((char)(i+97));
				return;
			}
		}
		System.out.println("None");


	}
}


