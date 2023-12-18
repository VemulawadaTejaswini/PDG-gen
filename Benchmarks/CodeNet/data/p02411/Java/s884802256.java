import java.util.*;

public class Main {


	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		int m,f,r;
		while(true){
			m = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			if(m+f+r==-3) break;
			int s = m+f;
			if(m==-1||f==-1) {System.out.println("F"); continue;}
			if(s>=80) System.out.println("A");
			if(s>=65&&s<80) System.out.println("B");
			if(s>=50&&s<65) System.out.println("C");
			if(s>=30&&s<50){
				if(r>=50) System.out.println("C");
				else System.out.println("D");
			}
			if(s<30) System.out.println("F");
		}
	}
}