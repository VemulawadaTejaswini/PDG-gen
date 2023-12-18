import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int C[] = new int[10000];
		int min=10000, max=0, wrk;
		for(int i=0; i<n; i++){
			wrk = sc.nextInt();
			C[wrk]++;
			if(min > wrk) min = wrk;
			if(max < wrk) max = wrk;
		}
		wrk=0;
		for(int i=min; i<=max; i++){
			for(int j=0; j<C[i]; j++){
				if(wrk == 0){
					System.out.print(i);
					wrk = 1;
				} else{
					System.out.print(" "+i);
				}
			}
		}
		System.out.println();
	}
}