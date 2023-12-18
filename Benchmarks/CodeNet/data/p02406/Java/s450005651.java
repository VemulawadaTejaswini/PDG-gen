import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i = 1;
		int x;
		while(true){
			x = i;
			if(x % 3 == 0){
				System.out.print(" "+i);
			}else{
				while(true){
					if(x % 10 == 3){
						System.out.print(" "+i);
						break;
					}
					x = x / 10;
					if (x == 0)break;
				}
			}
			if(++i > n)break;
		}
		System.out.println("");
	}
}