import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			int[] dis = new int[n];
			for(int i = 0;i < n-1;i++){
				dis[i+1] = dis[i] + scan.nextInt();
			}
			long sum = 0;
			int now = 0;
			int a;
			for(int i = 0;i < m;i++){
				a = scan.nextInt();
				sum += dis[now+((a > 0)?a:0)] - dis[now+((a > 0)?0:a)];
				now += a;
			}
			System.out.println((sum>=100000)?sum%100000:sum);
		}
	}
}