import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		boolean prevEqual=true;
		for(int i=1;i<=n;i++) {
			int d1=sc.nextInt();
			int d2=sc.nextInt();
			if(d1==d2) {
				if(i==1) count++;
				else {
					if(prevEqual) count++;
					else count=0;
				}
			}else {
				if(i!=1) prevEqual=false;
			}
		}
		System.out.println(count>=3?"Yes":"No");
		sc.close();
	}

}