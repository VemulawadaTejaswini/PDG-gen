import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long S=sc.nextLong();
		long C=sc.nextLong();

		if(C>=S*2) {
			System.out.println(S+(C-2*S)/4);
		}
		else {
			/*
			long fs=C/2;
			long zanC=C-fs*2+(S-fs)*2;
			System.out.println(fs+zanC/4);
			*/
			System.out.println(C/2);
		}
	}
}