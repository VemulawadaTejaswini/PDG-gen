import java.util.Scanner;
class Main{
	static Scanner sc = new Scanner(System.in);
	static int n,max,v[],w[],dp[][];
	public static void main(String[] args) {
		while(sc.hasNext()){
			n = sc.nextInt();
			max = sc.nextInt();
			v  = new int[n + 1];
			w  = new int[n + 1];
			for(int i = 1; i <= n; i++){
				v[i] = sc.nextInt();
				w[i] = sc.nextInt();
			}
			System.out.println(rec(1,0));
		}
	}
	static int res = 0;
	static int rec(int i ,int j){
		if(j > max){
			return -v[ i - 1];
		}
		if(i == n + 1){
			return 0;
		}
		
		res = Math.max(rec(i + 1 , j + w[i]) + v[i],rec(i + 1, j));
		return res; 
	}
}