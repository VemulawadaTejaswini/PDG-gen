import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int min = 1000;
		for(int i = 0; i < N ; i++){
			int a = sc.nextInt();
			X -= a;
			if(min > a){
				min = a;
			}
			
		}
		
		N += X/min;
		System.out.println(N);
	}
}
