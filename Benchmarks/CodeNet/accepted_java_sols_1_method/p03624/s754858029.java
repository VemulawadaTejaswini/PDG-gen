
import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);

		String a=sc.next();
		char[] mjs=new char[a.length()];

		for(int i=0; i<a.length(); i++) {
			mjs[i]=a.charAt(i);
		}

		int[] moji=new int[26];

		for(int i=0; i<a.length(); i++) {
			moji[mjs[i]-97]++;
		}

		char ke=97;
		for(int i=0; i<26; i++) {
			if(moji[i]==0) {
				ke+=i;
				char res=ke;
				System.out.println(res);
				System.exit(0);
			}
		}
		System.out.println("None");
	}
}