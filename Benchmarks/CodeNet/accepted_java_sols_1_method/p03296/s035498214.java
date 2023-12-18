import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int now = -1;
		int count = 0;
		int ans = 0;
		for(int i=0;i<N;++i){
			int next = sc.nextInt();
			if(now != next){
				ans += count/2;
				count = 1;
				now = next;
			}else{
				count++;
			}
		}
		ans += count/2;
		System.out.println(ans);
		return;
	}
}