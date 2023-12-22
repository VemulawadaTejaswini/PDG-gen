import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s= sc.next();
		int count = 0;
		for (int i=1;i<s.length()-1;i++) {
			String s1=s.substring(0,i);
			String s2= s.substring(i,s.length());
			int array1[]= new int[26];
			int array2[]= new int[26];
			for (int j=0;j<s1.length();j++) {
				array1[s1.charAt(j)-'a']++;
			}
			for (int j=0;j<s2.length();j++) {
				array2[s2.charAt(j)-'a']++;
			}
			int temp =0;
			for (int j=0;j<26;j++) {
				if (array1[j]>0&&array2[j]>0) {
					temp++;
				}
			}
			if (temp>count) {
				count =temp;
			}
		}
		System.out.println(count);
	}
}