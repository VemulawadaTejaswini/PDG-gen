import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int[] slide = new int[n];
			for(int i = 0;i < n;i++){
				slide[i] = scan.nextInt();
			}
			int now = 0;
			int[] step = new int[m];
			for(int i = 0;i < m;i++){
				step[i] = scan.nextInt();
			}
			for(int i = 0;i < m;i++){
				now += step[i];
				if(now >= n-1){
					System.out.println(i+1);
					break;
				}
				now += slide[now];
				if(now >= n-1){
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}