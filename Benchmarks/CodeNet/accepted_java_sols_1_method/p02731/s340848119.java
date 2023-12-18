import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		//a=b=c=L/3のとき最大なので、その時の体積はLの3乗/27となる
		System.out.println((double)L*L*L/27);
	}		
}