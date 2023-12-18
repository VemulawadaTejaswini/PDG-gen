import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdn = new Scanner(System.in);
		
		int x = 0;
		int i = 1;
		
		for(int r = 0; r <= 1000; r++){
			x = stdn.nextInt();
			if(x != 0){
				System.out.println("Case " + i + ": " + x);
			}else if(x == 0){
				break;
			}
			i++;
		}
	}
}