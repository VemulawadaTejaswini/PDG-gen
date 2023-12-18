import java.util.*;
public class Main{
	public static void main(String[] args){
		double ans_1 = 0;
		int ans_2 = 0;
		Scanner sc = new Scanner(System.in);
		double w = sc.nextInt();
		double h = sc.nextInt();
		double x = sc.nextInt();
		double y = sc.nextInt();

		ans_1 = w * h / 2;
		if(w / 2 == x && h / 2 == y){
			ans_2 = 1;
		}else{
			ans_2 = 0;
		}
		
		System.out.print(ans_1);
		System.out.print(" ");
		System.out.println(ans_2);
	}
}
