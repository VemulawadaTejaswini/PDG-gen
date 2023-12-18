import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> ViewList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		for(int i = 0; i < count; i++){
			int action = scanner.nextInt();

			switch(action){

			case 0:
				int num = scanner.nextInt();
				list.add(num);
				break;
			case 1:
				int num1 = scanner.nextInt();

				ViewList.add(list.get(num1));
				break;
			case 2:
				list.remove(list.size() - 1);
				break;
			default:
				System.out.println("0から2の間で入力してください");

			}
		}

		for(int i = 0; i < ViewList.size(); i++){
			int test = ViewList.get(i);
			System.out.println(test);
		}

	}


}

