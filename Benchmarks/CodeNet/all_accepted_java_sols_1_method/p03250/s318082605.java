import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num[];
		num = new int[3];
		
		int i = 0;
		
		for(i = 0;i < 3;i++){
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		
		int ans = num[2] * 10 + num[1] + num[0];
		
		System.out.println(ans);
	}
}