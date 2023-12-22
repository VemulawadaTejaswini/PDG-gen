//Volume1-0160
import java.util.Scanner;

class Main {

	public static void main(String[] arg){

		            int    n,l,w,size,sum;
		      final int    OVER = -1;
		      final int[]  srnk = { 60, 80, 100, 120, 140, 160},
		                   wrnk = {  2,  5,  10,  15,  20,  25},
		                   fee  = {600,800,1000,1200,1400,1600};

		Scanner sc = new Scanner(System.in);

		while((n = sc.nextInt()) != 0){
			sum = 0;
			while(n-- > 0){
				l = sc.nextInt()+sc.nextInt()+sc.nextInt();
				w = sc.nextInt();

				size = -1;
				for(int i=0;i<6;i++)
					if(l <= srnk[i] && w <= wrnk[i]){
						size = i;
						break;
					}
				if(size == OVER){continue;}
				sum += fee[size];
			}
			System.out.println(sum);
		}
	}
}