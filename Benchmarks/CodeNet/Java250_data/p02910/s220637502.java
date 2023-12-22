import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] S =sc.next().split("");
		int cnt=0;

		for(int i=0;i<S.length;i++) {
			if((i+1)%2==0) {
				if(S[i].matches("[LUD]")) {
					cnt++;
				}
			}else {
				if(S[i].matches("[RUD]")) {
					cnt++;
				}
			}
		}
		System.out.println(cnt==S.length?"Yes":"No");
	}
}
