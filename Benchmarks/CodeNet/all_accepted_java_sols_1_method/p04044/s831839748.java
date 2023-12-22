import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] info=sc.nextLine().split(" ");
		List<String> dic=new ArrayList<String>();
		while(sc.hasNextLine()){
			dic.add(sc.nextLine());
		}
		dic.stream().sorted().forEachOrdered(System.out::print);
		System.out.println();
	}
}