import java.util.*;
 
class Main{
	
	public static void main(String args[]){
 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x[] = new int[N];
 
		for(int n=0;n<N;n++){
			x[n] = sc.nextInt();
		}
 
		Arrays.sort(x);
 
		int max = x[N-1];
		int dist = -1;
		int t=-1;
		for(int n=0;n<N;n++){
			
			if(dist == -1 ||dist > Math.abs((max+1)/2-x[n])){
				dist = Math.abs((max+1)/2-x[n]);
				t = x[n];
			}
		}
		System.out.println(max+" "+t);
	}
}