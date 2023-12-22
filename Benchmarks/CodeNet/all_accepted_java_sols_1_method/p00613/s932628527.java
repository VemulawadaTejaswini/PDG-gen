import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt();
			if(n==0) return ;
			int total = 0;
			for(int i=0; i<n*(n-1)/2; i++){
				total += in.nextInt();
			}
			System.out.println(total/(n-1));
		}
	}
	
}