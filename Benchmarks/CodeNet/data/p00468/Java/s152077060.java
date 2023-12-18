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
			int[] st = new int[n];
			for(int i = 0;i < m;i++){
				int a = scan.nextInt() - 1;
				int b = scan.nextInt() - 1;
				if(a == 0){
					st[b] = 1;
				}else if(b == 0){
					st[a] = 1;
				}else{
					if(st[a] == 1){
						st[b] = 2;
					}else if(st[b] == 1){
						st[a] = 2;
					}
				}
			}
			int count = 0;
			for(int i = 0;i < n;i++){
				if(st[i] > 0){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}