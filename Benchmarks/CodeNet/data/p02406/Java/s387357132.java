import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int x;

		while(i<=n){
			x = i;
			if(x%3==0){
				System.out.print(" "+i);
				i++;
				continue;
			}
			while(x!=0){
				if(x%10==3){
					System.out.print(" "+i);
					break;
				}
				x /= 10;
			}
			i++;
		}
		System.out.println();
	}
}