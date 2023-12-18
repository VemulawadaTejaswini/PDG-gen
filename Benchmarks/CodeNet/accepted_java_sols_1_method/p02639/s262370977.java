import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int ans = 0;
		for(int i  = 0;i < 5; ++i){
			int x = scan.nextInt();
			if(x == 0){
				ans = i+1;
			}
		}
		System.out.print(ans);
	}
}
