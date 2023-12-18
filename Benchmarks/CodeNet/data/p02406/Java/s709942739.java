import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=1;i<=x;i++){
			int check=i;
			if(check%3==0 || check%10==3){
				System.out.print(" "+i);
			}
		}
	}
}
