import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] rabbits = new int[N];
		for(int i=0; i<N; ++i) {
			rabbits[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<N; ++i) {
			if(i == rabbits[rabbits[i]-1]-1)
				++sum;
		}
		sum = sum/2;
	
		System.out.println(sum);
		sc.close();
	}
}