import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int flag = 0;
		
		while(true){
			C = C - B;
			if (C <= 0){
				break;
			}
			A = A - D;
			if (A <= 0){
				flag = 1;
				break;
			}
		}
		
		if (flag == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
