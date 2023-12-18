import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] num = new int[n];
			for(int i = 0;i < n;i++){
				num[i] = scan.nextInt();
			}
			int s = scan.nextInt();
			int count = 0;
			int d = 0;
			int u = n-1;
			while(true){
				int t = (d + u)/2;
				if(num[t] == s){
					count++;
					break;
				}else if(u == d){
					count++;
					break;
				}else if(num[t] < s){
					d = t+1;
				}else if(num[t] > s){
					u = t-1;
				}
				count++;
			}
			System.out.println(count);
		}
	}
}