import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		//入力値の受け取り
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		
		char A[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		int len = S.length();
		StringBuilder sb =new StringBuilder();
		
		for(int i=0;i<len;i++) {
			char t = S.charAt(i);
			for(int j=0;j<27;j++) {
				if(t==A[j]) {
					sb.append(A[j+N]);
					break;
				}
			}
		}
		System.out.println(sb.toString());
	}
}