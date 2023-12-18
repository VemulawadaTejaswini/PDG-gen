import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		String c= sc.next();
		int count =0;
		for (int i=0;i<N;i++) {
			if (a.charAt(i)==b.charAt(i)) {
				if (c.charAt(i)!=b.charAt(i)) {
					count ++;
				}
			} else if (b.charAt(i)==c.charAt(i)) {
				count ++;
			} else if(a.charAt(i)==c.charAt(i)) {
				count ++;
			} else {
				count +=2;
			}
		}
		System.out.println(count);
		}
}