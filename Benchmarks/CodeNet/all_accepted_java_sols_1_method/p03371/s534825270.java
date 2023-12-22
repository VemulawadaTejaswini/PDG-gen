import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int price1 = 0;
		int price2 = 0;
		int price3 = 0;
		int price = 0;
		
		//個別
		price2 = (X * A) + (Y * B);
		
		if(X > Y){
			price3 = C * X * 2;
			price1 += C * Y * 2;
			X -= Y;
			price1 += X * A;
		}else{
			price3 = C * Y * 2;
			price1 += C * X * 2;
			Y -= X;
			price1 += Y * B;
		}
		
		price = Math.min(price1, price2);
		price = Math.min(price, price3);
		
		System.out.println(price);
	}
}
