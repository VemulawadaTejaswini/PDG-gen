
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> input=new ArrayList<String>(Arrays.asList(new Scanner(System.in).nextLine().split(" ")));
		int result=Integer.valueOf(input.get(0))*Integer.valueOf(input.get(1));
		String msg=result%2==0?"Even":"Odd";
		System.out.println(msg);

	}
}
