import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ary=new int[26];
		Arrays.fill(ary, 0);
		while(sc.hasNext()) {
			String s=sc.nextLine();
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)>='a' && s.charAt(i)<='z') {
					ary[s.charAt(i)-'a']++;
				}
				else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
					ary[s.charAt(i)-'A']++;
				}
				else {
					//
				}
			}
		}
		for(int i=0; i<26; i++) {
			System.out.println(((char) (i+'a'))+" : "+ary[i]);
		}
	}
}
