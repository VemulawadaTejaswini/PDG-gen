import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean flag = false;
		for(int i = 1; i <= 9; i++){
			if(N % i == 0){
				if(N / i <= 9)flag = true;
			}
		}
		System.out.println((flag)? "Yes": "No");		
	}
}