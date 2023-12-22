import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		try(Scanner sc = new Scanner(System.in)){
			int num;
			while((num = sc.nextInt()) != 0){
				list.add(num);
			}
		}
		for(int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			System.out.println("Case " + (i + 1) + ": " + num);
		}
	}
}