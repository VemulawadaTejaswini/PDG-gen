import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = -1;
		int max = 101 * 10;
		for(int i = 1;i < max;i++){
			boolean flg = false;
			if((int)(i * 0.08) == A && (int)(i * 0.1) == B){
					flg = true;
					ans = i;
					break;
			}
			if(flg){
				break;
			}
		}
		System.out.println(ans);
	}
}