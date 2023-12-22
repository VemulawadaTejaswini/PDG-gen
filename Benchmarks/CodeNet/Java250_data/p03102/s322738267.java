
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int c=scn.nextInt();
		int []b=new int[m];
		for(int i=0;i<m;i++) {
			b[i]=scn.nextInt();
		}
		int cnt=0;
		for(int j=0;j<n;j++) {
			long temp=c;
			for(int i=0;i<m;i++) {
				temp+=scn.nextInt()*b[i];
			}
			if(temp>0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
