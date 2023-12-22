import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		boolean flag = true;
		while(flag){
			flag = false;
			for(int i = 2; i < X; i++){
				if(X % i == 0){
					flag = true;
					break;
				}
			}
			if(flag)X++;
		}
		System.out.println(X);
	}
}