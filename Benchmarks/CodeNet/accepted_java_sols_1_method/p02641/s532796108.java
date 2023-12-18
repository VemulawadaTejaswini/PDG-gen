import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int integerX = sc.nextInt();  //元の整数
		int youso = sc.nextInt();  //整数列の要素数
		List<Integer> list = new ArrayList<Integer>();  //整数列を入れるリスト

		//配列を入力
		for(int i=0 ; i<youso ; i++) {
			list.add(sc.nextInt());
		}

		if(list.isEmpty() || list.contains(integerX) != true) {
			System.out.println(integerX);
			return;
		}

		for(int i=1 ; i<=100 ; i++) {
			if(! list.contains(integerX-i)) {
				System.out.println(integerX-i);
				break;
			}
			else if(! list.contains(integerX+i)) {
				System.out.println(integerX+i);
				break;
			}
		}
		sc.close();
	}
}