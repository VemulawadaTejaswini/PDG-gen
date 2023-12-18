import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = sc.nextLine();
		int count = 0;
		for(int i = 0;i<str1.length();i++) {
			if(str.charAt(i)!=str1.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
