import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt();
			if( n == 0 ) return ;
			for(int i=0; i<n; i++){
				int pm = in.nextInt(),
					pe = in.nextInt(),
					pj = in.nextInt();
				if(pm==100 || pe==100 || pj == 100)
					System.out.println("A");
				else if(pm + pe >= 180)
					System.out.println("A");
				else if(pm + pe + pj >= 240)
					System.out.println("A");
				else if(pm + pe + pj >= 210)
					System.out.println("B");
				else if(pm + pe + pj >= 150 && (pm >= 80 || pe >= 80))
					System.out.println("B");
				else
					System.out.println("C");
			}
		}
	}

}