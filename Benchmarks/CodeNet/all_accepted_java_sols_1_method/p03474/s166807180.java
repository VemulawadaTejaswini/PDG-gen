import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int A=scanner.nextInt();
		int B=scanner.nextInt();
		String s=scanner.next();
		int i=0;
		for (i = 0; i < A+B+1; i++) {
			char c=s.charAt(i);
			if (c>=48&&c<=57&&i!=A) {
				continue;
			}else if(i==A&&c=='-'){
				continue;
			}else {
				break;
			}
		}
		if (i!=A+B+1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}