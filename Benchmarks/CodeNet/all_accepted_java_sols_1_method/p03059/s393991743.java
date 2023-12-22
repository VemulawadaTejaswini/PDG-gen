import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double t = sc.nextInt();
	
		t += 0.5;
		int count = 0;
		int s = 1;

		boolean flag = true;
		while(flag){
			if(a * s < t){
				count++;
				s++;
			}else{
				flag = false;
			}
		}
		System.out.println(count * b);
	}
}
