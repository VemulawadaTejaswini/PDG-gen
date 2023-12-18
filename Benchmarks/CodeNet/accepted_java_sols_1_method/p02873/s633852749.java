import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		char[] s = S.toCharArray();
		int n = S.length();
		long count = 0;
		
		if(s[0] == '<') {
			for(int i = 0; i < n;) {
				long temp1 = 1;
				while(i < n-1 && s[i] == s[i+1]) {
					temp1++;
					i++;
				}
				i++;
				long temp2 = 1;
				while(i < n-1 && s[i] == s[i+1]) {
					temp2++;
					i++;
				}
				i++;
				count += temp1*(temp1-1)/2+temp2*(temp2-1)/2+Math.max(temp1,temp2);
			}
		}
		else {
			int i = 0;
			long temp = 1;
			while(i < n-1 && s[i] == s[i+1]) {
				temp++;
				i++;
			}
			i++;
			count += temp*(temp+1)/2;
			for(; i < n;) {
				long temp1 = 1;
				while(i < n-1 && s[i] == s[i+1]) {
					temp1++;
					i++;
				}
				i++;
				long temp2 = 1;
				while(i < n-1 && s[i] == s[i+1]) {
					temp2++;
					i++;
				}
				i++;
				count += temp1*(temp1-1)/2+temp2*(temp2-1)/2+Math.max(temp1,temp2);
			}
		}
		System.out.println(count);

	}

}