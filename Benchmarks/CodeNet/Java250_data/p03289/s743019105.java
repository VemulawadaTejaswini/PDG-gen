import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] S=sc.nextLine().split("");
		String ans="WA";
		if(S[0].equals("A")) {
			int cnt=0;
			for(int i=2;i<S.length-1;i++) {
				if(S[i].equals("C"))cnt=cnt+1;
			}
			if(cnt==1){
				int upcnt=0;
				for(int i=0;i<S.length;i++) {
					if(Character.isUpperCase( S[i].charAt( 0 ) ) ) {
						upcnt=upcnt+1;
					}
				}
				if(upcnt>2) {
				}else {
					ans="AC";
				}
			}
		}
		System.out.println(ans);
	}
}
