import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] InputArray = input.split(" ");
		if(InputArray.length == 2){
			int w = Integer.parseInt(InputArray[0]);
			int h = Integer.parseInt(InputArray[1]);
			int menseki = w * h;
			int syuu = 2 * (w + h);
			System.out.println(menseki + " " + syuu);
		}else{
			System.out.println("2つの整数を入力してください");
		}
	}
}