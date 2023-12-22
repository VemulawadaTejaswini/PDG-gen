import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int len=scanner.nextInt();
		String s=scanner.next();
		int max=0;
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='I') {
				sum++;
			}else {
				sum--;
			}
			if (max<sum) {
				max=sum;
			}
		}
		System.out.print(max);
	}
}