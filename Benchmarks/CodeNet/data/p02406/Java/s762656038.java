import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int work, n = sc.nextInt();
		for(int i = 3; i <= n; i++){
			if(i % 3 == 0){
				System.out.print(" " + i);
				continue;
			}
			work = i;
			while(work != 0){
				if(work % 10 == 3){
					System.out.print(" " + i);
					break;
				}
				work /= 10;
			}
		}
		System.out.println("");
	}
}