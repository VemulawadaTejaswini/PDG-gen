import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		int x;
		while(i <= n){
			x = i;
			if(x % 3 == 0){
				System.out.print(" " + i);
				i++;
				continue;
			}
			do{
				if(x % 10 == 3){
					System.out.print(" " + i);
					break;
					}
			}while((x /= 10) != 0);
			i++;
		}
		System.out.println("");
	}
}