import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int baseNum = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int num01 = 1;
		int num02 = 2;

		while(num > baseNum){
			if (num <= baseNum) {
				break;
			}
			num = num/baseNum;
			list.add(num%baseNum);
		}
		if(num == baseNum){
			System.out.println((list.size()+num02));
		}else{
			System.out.println((list.size()+num01));
		}
		sc.close();
	}
}