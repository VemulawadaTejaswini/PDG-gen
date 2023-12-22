import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int count = 0; boolean flag = false; int max = 0;
		for (int i = 0; i < s.length; i++) {
			if(flag) {
				if(s[i]=='A'||s[i]=='T'||s[i]=='G'||s[i]=='C') count++;
				else {
					flag = false;
					max = Math.max(max,count);
					count = 0;
				}
			}else {
				if(s[i]=='A'||s[i]=='T'||s[i]=='G'||s[i]=='C') {
					flag = true;
					count = 1;
				}
			}
		}
		max = Math.max(max,count);
		System.out.println(max);
		sc.close();
	}
}