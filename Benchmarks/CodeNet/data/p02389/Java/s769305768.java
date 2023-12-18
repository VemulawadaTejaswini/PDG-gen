import java.util.*;

public class Main{
	public static void main(String[] args){
		String input = new Scanner(System.in).nextLine();
		String[] num = input.split("\s");
		int area = Integer.parseInt(num[0]) * Integer.parseInt(num[1]);
		int length = (Integer.parseInt(num[0]) + Integer.parseInt(num[1])) * 2;
		System.out.println(area + "\s" + length);
	}
}