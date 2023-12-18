import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int lmax=sc.nextInt();
		int rmin=sc.nextInt();
		int l, r;
		for(int i=1;i<m;i++) {
			l=sc.nextInt();
			r=sc.nextInt();
			if(lmax<l)
				lmax=l;
			if(rmin>r)
				rmin=r;
		}
		if(rmin-lmax+1<0)
			System.out.print(0);
		else
			System.out.print(rmin-lmax+1);
		
		

	}

}