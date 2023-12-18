import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < line; i++){
			list.add(sc.nextInt());
		}
		Collections.reverse(list);
		for(int i = 0; i < list.size(); i++){
			if(i == 0){
				System.out.print(list.get(i));
			}else{
				System.out.print(" " + list.get(i));
			}
		}
	}

}

