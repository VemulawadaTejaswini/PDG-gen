import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int sec, min, hour;
		System.out.print("秒数を入力：");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a<b && b<c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
