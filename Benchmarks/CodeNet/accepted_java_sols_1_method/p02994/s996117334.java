import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int eat = 0;
		if(l < 0){
			if(-l < n-1){
				eat = -l;
			}else{
				eat = n-1;
			}
		}
		int ans = -(eat + l);
		for(int i = 0; i < n; i++){
			ans += i + l;
		}
		System.out.println(ans);
	}
}
