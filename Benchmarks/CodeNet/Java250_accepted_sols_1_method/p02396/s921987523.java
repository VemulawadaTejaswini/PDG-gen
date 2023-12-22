import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		
		Scanner sc = new Scanner(System.in);
		int intX = -1;
		int i = 0;

		while(intX != 0){
			intX = sc.nextInt();

			if(intX == 0 ){
				break;
			}

			i++;

			System.out.println("Case " + i + ": " + intX);
		}
	}
}