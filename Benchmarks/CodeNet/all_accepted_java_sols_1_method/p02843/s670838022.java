import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int xx = sc.nextInt();
		
		int hyaku = (int)xx / 100;
		int sum = 0;
		int tmp;
		
		tmp = xx % 100;
		
		sum = sum + (int)tmp / 5;
		tmp = tmp % 5;
	
		sum = sum + (int)tmp / 4;
		tmp = tmp % 4;
		sum = sum + (int)tmp / 3;
		tmp = tmp % 3;
		sum = sum + (int)tmp / 2;
		tmp = tmp % 2;
		sum = sum + (int)tmp / 1;
		tmp = tmp % 1;
		
		if (hyaku >= sum){
			System.out.print("1");
		}else{
			System.out.print("0");
		}
	}
}