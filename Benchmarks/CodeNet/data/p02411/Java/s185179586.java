import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int m=sc.nextInt();
			int f=sc.nextInt();
			int r=sc.nextInt();
			if(m*f*r==-1 && m+f+r==-3) {
				System.exit(0);
			}
			else {
				System.out.println(exam(m,f,r));
			}
		}
	}
	public static char exam(int m,int f,int r) {
		if(m == -1 || f == -1) {
			return 'F';
		}
		else if(m+f>=80) {
			return 'A';
		}
		else if(m+f>=65) {
			return 'B';
		}
		else if(m+f>=50) {
			return 'C';
		}
		else if(r>=50) {
			return 'C';
		}
		else if(m+f>=30) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
}
