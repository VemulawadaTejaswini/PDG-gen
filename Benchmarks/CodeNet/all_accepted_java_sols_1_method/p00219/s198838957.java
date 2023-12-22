import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt();
			if( n == 0 ) return ;
			int ns[] = new int[10];
			for(int i=0; i<n; i++)
				ns[in.nextInt()]++;
			for(int i=0; i<10; i++){
				for(int j=0; j<ns[i]; j++)
					System.out.print('*');
				System.out.println(ns[i]==0?"-":"");
			}
		}
	}

}