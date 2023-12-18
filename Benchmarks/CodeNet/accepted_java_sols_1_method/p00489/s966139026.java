import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int rc = i * (i - 1) / 2;
		int ten[] = new int[i];
		for(int j = 0; j < i; j++){
			ten[j] = 0;
		}
		for(int j = 0; j < rc; j++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if(c > d){
				ten[a-1] = ten[a-1] + 3;
			}else if(c < d){
				ten[b-1] = ten[b-1] + 3;
			}else if(c == d){
				ten[a-1] = ten[a-1] + 1;
				ten[b-1] = ten[b-1] + 1;
			}
		}
		for(int j = 0; j < i; j++){
			int cnt = 0;
			for(int k = 0; k < i; k++){
				if(ten[j] >= ten[k]){
					cnt = cnt + 1;
				}
			}
			int rank = i - cnt + 1;
			System.out.println(rank);
		}
	}
}