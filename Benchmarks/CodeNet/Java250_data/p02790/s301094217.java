import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		List<String> list = new ArrayList();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < a;i++){
			sb.append(b);
		}
		list.add(sb.toString());
		sb.delete(0, sb.length());
		for(int i = 0;i < b;i++){
			sb.append(a);
		}
		list.add(sb.toString());
		list.sort(Comparator.naturalOrder());
		System.out.println(list.get(0));
	}
}