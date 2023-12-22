import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt();
			if( n == 0 ) return ;
			int key = -1, dist = -1;
			for(int i=0; i<n; i++){
				int id = in.nextInt();
				int d = in.nextInt() + in.nextInt();
				if( d > dist ){
					key = id;
					dist = d;
				}
			}
			System.out.println(key + " " + dist);
		}
	}

}