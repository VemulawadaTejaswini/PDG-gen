import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a,b,sum1,sum2;
		sum1 = sum2 = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		for(int i = 0;i < 999;i++){
			sum1 += i;
			sum2 += i + 1;
			
			if(sum1 >= a && sum2 >= b){
				if(sum1 - a == sum2 - b){
					System.out.println(sum1 - a);
				}
			}
		}
	}
}