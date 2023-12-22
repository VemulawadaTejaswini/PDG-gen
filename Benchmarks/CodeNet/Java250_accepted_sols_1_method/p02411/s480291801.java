import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i= 0;i<50;i++) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();

			if(m==-1 && f==-1 && r==-1) break;
			if(m==-1 || f==-1) System.out.println("F");
			else {
				if(m+f>=80) System.out.println("A");
				if(80>m+f && m+f>=65) System.out.println("B");
				if(65>m+f && m+f>=50) System.out.println("C");
				if(50>m+f && m+f>=30 && r>=50) System.out.println("C");
				if(50>m+f && m+f>=30 && 50>r) System.out.println("D");
				if(30>m+f) System.out.println("F");
			}
		}
	}
}
