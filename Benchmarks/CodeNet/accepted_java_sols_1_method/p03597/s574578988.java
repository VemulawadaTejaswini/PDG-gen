import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		
		int s = N*N;
		int result = s - A;
			 System.out.println(result);	
		}
	}