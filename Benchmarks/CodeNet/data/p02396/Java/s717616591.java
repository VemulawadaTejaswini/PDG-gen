import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdn = new Scanner(System.in);
		
		int x = 0;
		int i = 0;
		while(i < 1000){
			int t = 1;
			x = stdn.nextInt();
			if(x != 0){
				System.out.println("Case " + t + ": " + x);
			}else if(x == 0){
				break;
			}
			i++;
		}
	}
}