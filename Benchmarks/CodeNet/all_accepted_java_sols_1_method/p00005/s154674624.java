import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()==true){
			int n = in.nextInt();
			int m = in.nextInt();
			int l=n;
			int k=m;
			int r=0;
			if(m>n){
				r=n;
				n=m;
				m=r;
			}
			while(m!=0){
				n=n%m;
				r=n;
				n=m;
				m=r;
				}
			System.out.print(n+" ");
			System.out.println(l/n*k);
		}
	}
		
}
				