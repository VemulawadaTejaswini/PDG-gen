import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		for(int i = 1;i < N+1;i++){
			if(i < 10){
				ans++;
			}else if(i > 99 && i < 1000){
				ans++;
			}else if(i > 9999 && i < 100000){
				ans++;
			}
		}
		System.out.println(ans);
	}
}