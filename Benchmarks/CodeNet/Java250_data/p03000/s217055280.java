import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);


	List<Integer> list = new ArrayList<>();
	int N = std.nextInt();
	int X = std.nextInt();

	int count = 1; //跳ねる回数
	int zahyo = 0; //座標

	for(int i = 0; i < N; i++) {
		int L = std.nextInt();
		list.add(L);

	}

	//count <= N+1 条件1
	//足していってた座標がX以下
	//

	for(int i = 0; i < N; i++) {
		zahyo += list.get(i);
		if(count > N+1 || zahyo > X) {
			break;
		}
		count++;
	}
		System.out.println(count);

	}


	}


