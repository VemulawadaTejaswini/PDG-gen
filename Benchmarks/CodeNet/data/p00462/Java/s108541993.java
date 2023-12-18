import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int d = scan.nextInt();
			if(d == 0){
				break;
			}
			int n = scan.nextInt();
			int m = scan.nextInt();
			int[] shop = new int[n+1];
			shop[0] = 0;
			shop[n] = d;
			for(int i = 1;i < n;i++){
				shop[i] = scan.nextInt();
			}
			int sum = 0;
			int t = 0;
			int g = 0;
			for(int i = 0;i < m;i++){
				g = scan.nextInt();
				t = Math.abs(g - shop[0]);
				for(int j = 1;j < n+1;j++){
					t = Math.min(t,Math.abs(g-shop[j]));
				}
				sum += t;
			}
			System.out.println(sum);
		}
	}
}