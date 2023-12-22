import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		List<String> arrayList = new ArrayList<>();
		in.nextLine();
		for(int i = 0; i < n;i++) {
			arrayList.add(in.nextLine());
		}
		in.close();
		Collections.sort(arrayList);
		for(String e : arrayList) {
			System.out.print(e);
		}

	}
}