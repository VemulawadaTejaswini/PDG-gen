
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kosu=sc.nextInt();

		int kisu=0;
		int niba=0;
		int four=0;

		int tmp=0;
		for(int i=0; i<kosu; i++) {
			tmp=sc.nextInt();
			if(tmp%2==1) {
				kisu++;
			}
			else if(tmp%2==0 && tmp%4==2) {
				niba++;
			}
			else if(tmp%4==0) {
				four++;
			}
		}
		int score=kosu-niba;

		if((score-four)<=four) {
			System.out.println("Yes");
		}
		else if((score-four-1)==four && niba==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}