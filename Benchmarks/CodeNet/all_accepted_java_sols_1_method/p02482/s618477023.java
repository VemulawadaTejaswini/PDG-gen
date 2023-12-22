import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArray = input.split(" ");
		if(inputArray.length == 2){
			int n1 = Integer.parseInt(inputArray[0]);
			int n2 = Integer.parseInt(inputArray[1]);
			System.out.print("a");
			if(n1 < n2){
				System.out.print(" < ");
			}else if(n1 > n2){
				System.out.print(" > ");
			}else{
				System.out.print(" == ");
			}
			System.out.println("b");
		}
	}
}