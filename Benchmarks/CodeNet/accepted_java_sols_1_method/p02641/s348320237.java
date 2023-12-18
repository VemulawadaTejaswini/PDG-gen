import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();

		if(N==0){
			System.out.println(X);
			return;
		}
		if(N==100){
			if(X<=50){
				System.out.println(0);
				return;
			}else{
				System.out.println(101);
				return;
			}
		}

		for(int i=0; i<N; i++){
			set.add(sc.nextInt());
		}

		Integer abs = 100;
		Integer ptr = 0;

		for(int i=0; i<102; i++){
			if(set.contains(i)){
				continue;
			}
			Integer tmp = Math.abs(X-i);
			if(tmp<abs){
				abs = tmp;
				ptr = i;
			}
		}

		System.out.println(ptr);
		return;
	}
}