import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		
		for(int i=0; i<M; i++){
			N -= Integer.parseInt(sc.next());
		}
	
		if(N >= 0) {
			System.out.println(N);
		} else {
			System.out.println(-1);
		}
		
	}

}