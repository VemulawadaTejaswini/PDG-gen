import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		for(int i = 1;i < N+1;i += 2){
			int count = 0;
			for(int j = 1;j < i+1;j ++){
				if(i % j == 0){
					count++;
				}
			}
			if(count == 8){
				ans++;
			}
		}
		System.out.println(ans);
	}
}