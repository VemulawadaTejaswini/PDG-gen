import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n==0 && s==0)break;
			int sum = 0;
			int cnt = 0;
			for(int i=0;i<10;i++){
				if(n > s)break;
				if(sum + i <= s){
					sum += i;
					cnt++;
				}
				if(cnt == n)break;
			}
			System.out.println(cnt);
		}
	}
}

