import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			int[] dis = new int[n-1];
			for(int i = 0;i < n-1;i++){
				dis[i] = scan.nextInt();
			}
			int sum = 0;
			int now = 0;
			for(int i = 0;i < m;i++){
				int a = scan.nextInt();
				if(a > 0){
					for(int j = now;j < now+a;j++){
						sum += dis[j];
					}
				}else{
					for(int j = now-1;j >= now+a;j--){
						sum += dis[j];
					}
				}
				now += a;
				if(sum >= 500000){
					sum %= 100000;
				}
			}
			System.out.println((sum>=100000)?sum%100000:sum);
		}
	}
}