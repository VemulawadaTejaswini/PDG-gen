import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		
		HashSet<Integer> integers=new HashSet<Integer>();
		while(true) {
			
			if(!integers.add(N)) {
				break;
			}
			N=function(N);
		}
		
		System.out.println(integers.size()+1);
		sc.close();
	}
	
	public static Integer function(Integer N) {
		if(N%2==0) {
			N=N/2;
		}else {
			N=3*N+1;
		}
		return N;
	}
}
