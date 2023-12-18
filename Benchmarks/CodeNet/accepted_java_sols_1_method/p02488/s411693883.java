import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String[] list;
	public static void main(String[] args) {
		int n = sc.nextInt();
		list = new String[n];
		for(int i = 0; i < list.length; i++){
			list[i] = sc.next();
		}
		Arrays.sort(list);
		System.out.println(list[0]);
	}

}