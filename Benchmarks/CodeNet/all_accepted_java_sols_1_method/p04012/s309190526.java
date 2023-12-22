import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String a=sc.next();

		int[] cmj=new int[26];

		for(int i=0; i<a.length(); i++) {
			cmj[a.charAt(i)-97]++;
		}

		for(int i=0; i<26; i++) {
			if(cmj[i]%2==1) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}