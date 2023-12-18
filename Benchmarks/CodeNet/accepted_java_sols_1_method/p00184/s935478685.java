import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
				int n = scan.nextInt();
				if(n == 0){
					break;
				}
				int[] vis = new int[7];
				for(int i = 0;i < n;i++){
					int t = scan.nextInt();
					if(t >= 60){
						vis[6]++;
					}else if(t >= 50){
						vis[5]++;
					}else if(t >= 40){
						vis[4]++;
					}else if(t >= 30){
						vis[3]++;
					}else if(t >= 20){
						vis[2]++;
					}else if(t >= 10){
						vis[1]++;
					}else{
						vis[0]++;
					}
				}
				for(int i = 0;i < 7;i++){
					System.out.println(vis[i]);
				}
		}
	}
}