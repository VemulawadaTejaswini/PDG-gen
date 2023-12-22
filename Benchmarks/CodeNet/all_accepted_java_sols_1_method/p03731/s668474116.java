import java.util.Scanner;
public class Main {

	public static void main(String[] args)throws Exception {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int T=stdIn.nextInt();
		int t[]=new int[N];
		int key=0;
		int z=0;
		while(z<N) {
			t[z]=stdIn.nextInt();
			if(z!=0) {
				if(t[z]-t[z-1]>T) 
					key+=T;
				else
					key+=t[z]-t[z-1];
			}
			z++;
		}key+=T;
		System.out.println(key);
	}
}