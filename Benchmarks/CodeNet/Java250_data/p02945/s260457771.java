import java.util.*;
public class Main{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), max = 0;
		if(a+b > a-b){
			max = a+b;
		}else{
			max = a-b;
		}
		if(max > a*b){
			max = max;
		}else{
			max = a*b;
		}
		System.out.println(max);
	}
}