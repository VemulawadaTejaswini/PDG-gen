import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int[] sugo = new int[n];
			for(int i = 0;i < n;i++){
				sugo[i] = scan.nextInt();
			}
			int[] op = new int[m];
			for(int i = 0;i < m;i++){
				op[i] = scan.nextInt();
			}
			int now = 1;
			for(int i = 0;i < m;i++){
				now += op[i] + sugo[now-1];
				if(now < 1){
					now = 1;
				}
				if(now >= n){
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}