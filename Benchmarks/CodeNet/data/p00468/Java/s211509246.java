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
			int count = 0;
			int[][] t = new int[m][2];
			for(int i = 0;i < m;i++){
				t[i][0] = scan.nextInt() - 1;
				t[i][1] = scan.nextInt() - 1;
			}
			while(count < 2){
				for(int i = 0;i < m;i++){
					if(t[i][0] == 0){
						st[t[i][1]] = 1;
					}else if(t[i][1] == 0){
						st[t[i][0]] = 1;
					}else{
						if(st[t[i][0]] == 1){
							st[t[i][1]] = 2;
						}else if(st[t[i][1]] == 1){
							st[t[i][0]] = 2;
						}
					}
				}
				count++;
			}
			count = 0;
			for(int i = 0;i < n;i++){
				if(st[i] > 0){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}