import java.util.*;
import java.text.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int h=0;
		int count=0;

		for(int i = 1; i<=n; i++){
			h = sc.nextInt();
			if(h >= k){
				count++;
			}
		}
		System.out.println(count);
	}
}