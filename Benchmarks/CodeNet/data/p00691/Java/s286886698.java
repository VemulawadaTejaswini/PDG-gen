import java.util.*;
import static java.util.Arrays.*;

public class Main {

	int[] as;

	void run(){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=1; i<=1111; i++){
			for(int j=i; j<=1111; j++){
				arr.add(i*i*i + j*j*j);
			}
		}
		as = new int[arr.size()];
		for(int i=0; i<as.length; i++)
			as[i] = arr.get(i);
		sort(as);
		for(;;){
			int n = in.nextInt();
			if(n == 0) return ;
			System.out.println(solve(n));
		}
	}

	int solve(int z){
		int id = -2 - binarySearch(as, z*z*z);
		return z*z*z - as[id];
	}

	public static void main(String args[]){
		new Main().run();
	}
}