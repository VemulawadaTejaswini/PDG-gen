import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		boolean ans=false;
		int man=0;
		int go=0; 
		int sen = 0;
		int iMax= y/10000;
		a: for(int i=0; i<=iMax; i++) {
			int jMax= (y-i*10000)/5000;
			for(int j=0; j<=jMax; j++) {
					if((y-i*10000-j*5000)/1000 == n-i-j) { ans=true;
					man=i;
					go=j;
					sen=n-i-j;
					break a;}
				}
			}
		if(ans) {
			System.out.println(man +" "+go+" "+sen);
		} else {
			System.out.println(-1+" "+-1+" "+-1);
		}
	}
}
