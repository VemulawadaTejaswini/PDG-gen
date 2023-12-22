import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] top = sc.next().toCharArray();
		int price = 700;
		for (int i=0; i<3; i++){
			if (top[i]=='o'){
				price+=100;
			}
		}
		System.out.println(price);

	}

}