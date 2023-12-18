import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int sum = 0;
			int now = 0;
			for(int i = 0;i < n;i++){
				int t = scan.nextInt();
				if(t < 0 && sum < now){
					sum = now;
				}
				if(now < 0){
					now = t;
				}else{
					now += t;
				}
				if(sum < now){
					sum = now;
				}
			}
			System.out.println(sum);
		}
	}
}