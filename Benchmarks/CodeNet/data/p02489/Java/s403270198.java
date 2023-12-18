import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner rd = new Scanner(System.in);

		for(int i = 1; ;i++){
			int x = rd.nextInt();
			if(x == 0) break;
			System.out.printf("case %d: %d",i,x);
		}
	}
}