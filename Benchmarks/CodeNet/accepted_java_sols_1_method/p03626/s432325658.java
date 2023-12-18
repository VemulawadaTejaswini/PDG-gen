import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s1 = sc.next();
		String s2 = sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s1.length(); i++) {
			if(s1.substring(i, i+1).equals(s2.substring(i, i+1))) {
				sb.append("T");
			} else {
				sb.append("Y");
				i++;
			}
		}
		String joge = sb.toString();
		int num[] = new int[joge.length()];
		Arrays.fill(num, 1);
		char[] isTate = joge.toCharArray();
		num[0] = isTate[0]=='T' ? 3 : 6;
		for(int i = 1; i < isTate.length; i++) {
			if(isTate[i-1]=='T'&&isTate[i]=='T') {
				num[i]=2;
			} else if(isTate[i-1]=='T'&&isTate[i]=='Y') {
				num[i]=2;
			} else if(isTate[i-1]=='Y'&&isTate[i]=='T') {
				num[i]=1;
			} else if(isTate[i-1]=='Y'&&isTate[i]=='Y') {
				num[i]=3;
			}
		}
		Long count = 1L;
		for(int i : num) {
			count = (count * i) % 1000000007;
		}
		System.out.println(count);
	}
}