import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String C = sc.next();
		int count = 1;
		for (int i = 1; i < C.length(); i++) {
			if (!C.substring(i - 1, i).equals(C.substring(i, i + 1))) count++;
		}
		System.out.println(count);
	}
}