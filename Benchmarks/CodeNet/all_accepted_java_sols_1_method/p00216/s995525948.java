import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			if(w == -1)break;
			
			int pay = 0;
			if(w < 10)pay += 1150;
			if(10 <= w && w < 20)pay += 125 * (w-10) + 1150;
			if(20 <= w && w < 30)pay += 140 * (w-20) + 125 * 10 + 1150;
			if(30 <= w)pay += 160 * (w-30) + 125 * 10 + 140 * 10 + 1150;
			
			System.out.println(4280-pay);
		}
		sc.close();
	}
}