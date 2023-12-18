import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value = n;
		for (int i = 0; ; i++) {
			value = n + i;
			if (value % 111 == 0) {
				break;
			}
		}
		System.out.println(value);
	}
	
}