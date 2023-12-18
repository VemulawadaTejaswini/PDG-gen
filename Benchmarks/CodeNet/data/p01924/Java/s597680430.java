import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int T=0,D=0,L=0;
		int z=0,x=0,k=0;
		long answe[]=new long[40];
		boolean w=false;
		while(true){
			T=stdIn.nextInt();
			D=stdIn.nextInt();
			L=stdIn.nextInt();
			if(T==0&&D==0&&L==0)
				break;
			long ans=0;
			x=D;
			while(z<T){
				int y=stdIn.nextInt();
				if(y>=L){
					if(x==0||x==D&&w==false)
						ans--;
					ans++;
					w=true;
					x=D;
				}
				if(y<L){
					if(x!=D&&x!=0){
						x--;
						ans++;
					}
					if(w){
						w=false;
						x--;
						ans++;
					}
				}
				z++;
			}z=0;
			w=false;
			answe[k]=ans;
			k++;
		}z=0;
		while(z<k){
			System.out.println(answe[z]);
			z++;
		}
	}
}

