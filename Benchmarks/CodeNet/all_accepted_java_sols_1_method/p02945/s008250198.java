import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = 0;
		if(a+b >= a-b){
			max = a+b;
		}else{
			max = a-b;
		}
		
		if(max < a*b){
			max = a*b;
		}
		
		System.out.println(max);
	}
}