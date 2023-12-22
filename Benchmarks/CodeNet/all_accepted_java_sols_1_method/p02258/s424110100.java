import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int R[] = new int[N];
		int i, j;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(i=0; i<N; i++){
			R[i] = sc.nextInt();
		}
		for(i=0; i<N-1; i++){
			if(min<=R[i]) continue;
			min=R[i];
			for(j=i+1; j<N; j++){
				if(max<R[j]-R[i]) max=R[j]-R[i];
			}
		}
		System.out.println(max);
	}
}