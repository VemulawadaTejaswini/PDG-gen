import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int m=sc.nextInt();
		int f=sc.nextInt();
		int r=sc.nextInt();
		if(m==-1 && f==-1 && r==-1) {
			break;
		}else {
			int x;
			x=m+f;
			if(m==-1 || f==-1) {
				System.out.println("F");
			}
			if(x>=80 && m!=-1 && f!=-1 ) {
				System.out.println("A");
			}
			if(x<80 && x>=65 && m!=-1 && f!=-1 ) {
				System.out.println("B");
			}
			if(x<65 && x>=50 && m!=-1 && f!=-1 ) {
				System.out.println("C");
			}
			if(x<50 && x>=30 && m!=-1 && f!=-1 && r>=50) {
				System.out.println("C");
			}if(x>=30 && x<50 && m!=-1 && f!=-1 && r<50) {
				System.out.println("D");
			}
			if(x<30 && m!=-1 && f!=-1 ) {
				System.out.println("F");
			}
		}
	}
}
}

