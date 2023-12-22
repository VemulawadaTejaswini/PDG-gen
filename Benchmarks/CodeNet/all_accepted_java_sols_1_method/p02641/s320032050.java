import java.util.HashSet;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int integerX = sc.nextInt();  //元の整数
		int youso = sc.nextInt();  //整数列の要素数
		HashSet<Integer> list = new HashSet<Integer>();  //整数列を入れるリスト

		//配列を入力
		for(int i=0 ; i<youso ; i++) {
			list.add(sc.nextInt());
		}

		int i = integerX-1;
		int j = integerX+1;

		if(list.isEmpty() || list.contains(integerX) != true) {
			System.out.println(integerX);
			return;
		}

		for(;;) {
			if(list.contains(i)) {
				i--;
			}
			else{
				System.out.println(i);
				return;
			}

			if(list.contains(j)) {
				j++;
			}
			else {
				System.out.println(j);
				return;
			}
		}
	}
}