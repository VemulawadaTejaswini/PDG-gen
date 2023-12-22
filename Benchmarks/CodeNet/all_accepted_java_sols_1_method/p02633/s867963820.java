import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ans=0;
		int tmp=0;
		while(true) {
			ans+=1;
			tmp+=n;
			if(tmp%360==0) {
				System.out.println(ans);
				break;
			}
		}
		
	}

}
