import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intInput = scan.nextInt();
		boolean isOut = false;
		for(int i = 1; i <= intInput; i++){
			if(i % 3 == 0){
				System.out.print(i);
				isOut = true;
			}else if(i % 10 == 3){
				System.out.print(i);
				isOut = true;
			}
			if(intInput == i){
				System.out.println("");
			}else if(isOut){
				System.out.print(" ");
			}
			isOut = false;
		}
		scan.close();
	}
}