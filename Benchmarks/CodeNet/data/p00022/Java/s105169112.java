import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] a = new int[n];
			boolean sw = false;
			for(int i = 0;i < n;i++){
				a[i] = scan.nextInt();
				if(a[i] > 0 && sw == false){
					sw = true;
				}
			}
			int sum = 0;
			if(sw){
				int now = 0;
				for(int i = n-1;i >= 0;i--){
					if(a[i] < 0 && sum < now){
						sum = now;
					}
					if(now < 0){
						now = a[i];
					}else{
						now += a[i];
					}
					if(sum < now){
						sum = now;
					}
				}
			}else{
				for(int i = 0;i < n;i++){
					sum += a[i];
				}
			}
			System.out.println(sum);
		}
	}
}