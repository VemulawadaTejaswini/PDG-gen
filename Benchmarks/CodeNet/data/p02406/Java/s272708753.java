import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int x = 1;
		while(x <= i){
			if(x%3==0){
				System.out.printf(" %d",x);
			}
			else if(x%10==3){
				System.out.printf(" %d",x);
			}
			x++;
		}
		System.out.printf("\n");
	}
}