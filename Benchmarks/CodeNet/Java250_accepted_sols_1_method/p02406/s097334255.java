import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intInput = scan.nextInt();
		for(int i = 1; i <= intInput; i++){
			if(i % 3 == 0){
				System.out.print(" " + i);
			}else if(i % 10 == 3){
				System.out.print(" " + i);
			}else if(String.valueOf(i).contains("3")) {
				System.out.print(" " + i);
			}
			if(intInput == i){
				System.out.println("");
			}
		}
		scan.close();
	}
}