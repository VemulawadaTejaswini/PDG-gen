//Volume1-0160
import java.util.Scanner;

class Main {

	public static void main(String[] arg){

		            int    n,l,lr,w,wr,sum;
		      final int[]  srnk = { 60, 80, 100, 120, 140, 160},
		                   wrnk = {  2,  5,  10,  15,  20,  25},
		                   fee  = {600,800,1000,1200,1400,1600};

		Scanner sc = new Scanner(System.in);

		while((n = sc.nextInt()) != 0){
			sum = 0;
			while(n-- > 0){
				l = sc.nextInt()+sc.nextInt()+sc.nextInt();
				w = sc.nextInt();

				lr = -1;
				for(int i=0;i<6;i++)
					if(l <= srnk[i]){
						lr = i;
						break;
					}
				if(lr == -1){continue;}

				wr = -1;
				for(int i=0;i<6;i++)
					if(w <= wrnk[i]){
						wr = i;
						break;
					}
				if(wr == -1){continue;}

				if   (lr<wr){sum += fee[wr];}
				else        {sum += fee[lr];}
			}
			System.out.println(sum);
		}
	}
}