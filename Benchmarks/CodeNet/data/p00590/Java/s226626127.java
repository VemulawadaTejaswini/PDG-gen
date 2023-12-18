
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean[] pmap = new boolean[10001];
		pmap[1]=true;
		for(int i=2;i<10000;i++)
			if(!pmap[i])
				for(int j=2;i*j<=10000;j++)
					pmap[i*j]=true; //素数でない


		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			int n = scan.nextInt();

			int c=0;
			for(int i=1;i<=n;i++){
				int j=n+1-i;
				if(!pmap[i] && !pmap[j])
					c++;
			}
			System.out.println(c);
		}
	}

}