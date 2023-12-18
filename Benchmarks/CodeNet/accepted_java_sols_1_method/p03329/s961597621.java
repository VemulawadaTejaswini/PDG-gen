import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = n;
		for(int i=0; i<=n; i++){
			int nin = i;
			int six = n - i;
			int cnt  = 0;
			while(nin!=0){
				cnt += nin % 9;
				nin /= 9;
			}
			while(six!=0){
				cnt += six % 6;
				six /= 6;
			}
			min = Math.min(min, cnt);
		}	
		System.out.println(min);
	}
}