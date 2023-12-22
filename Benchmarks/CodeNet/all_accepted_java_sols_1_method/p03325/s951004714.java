import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int na;
		int cnt = 0;
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			na = sc.nextInt();
			while(na%2==0){
				na/=2;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
