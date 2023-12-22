import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=13;
		int d[]=new int[count];
		int h[] =new int[count];
		int s[]=new int[count];
		int c[]=new int[count];
		int ds=0;
		int hs=0;
		int ss=0;
		int cc=0;
		for(int i=0;i<n;i++) {
			String mark=sc.next();
			if(mark.equals("S")) {
				s[ss]=sc.nextInt();
				ss++;
			}else if(mark.equals("D")) {
				d[ds]=sc.nextInt();
				ds++;
			}else if(mark.equals("C")) {
				c[cc]=sc.nextInt();
				cc++;
			}else {
				h[hs]=sc.nextInt();
				hs++;
			}
		}
		for(int i=1;i<=13;i++) {
			int check=0;
			for(int j=0;j<s.length;j++) {
				if(i==s[j]) {
					check++;
				}
			}
			if(check==0) {
				System.out.println("S "+i);
			}
		}
		for(int i=1;i<=13;i++) {
			int check=0;
			for(int j=0;j<h.length;j++) {
				if(i==h[j]) {
					check++;
				}
			}
			if(check==0) {
				System.out.println("H "+i);
			}
		}
		for(int i=1;i<=13;i++) {
			int check=0;
			for(int j=0;j<c.length;j++) {
				if(i==c[j]) {
					check++;
				}
			}
			if(check==0) {
				System.out.println("C "+i);
			}
		}
		for(int i=1;i<=13;i++) {
			int check=0;
			for(int j=0;j<d.length;j++) {
				if(i==d[j]) {
					check++;
				}
			}
			if(check==0) {
				System.out.println("D "+i);
			}
		}
	}
}
