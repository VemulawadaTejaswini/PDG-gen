import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] ss = sc.next().split("");
		int sum = 0;
		for(int i=0; i<ss.length; i++) {
			if(ss[i].equals("+")) {
				sum += 1;
			}else if(ss[i].equals("-")) {
				sum -= 1;
			}
		}
		System.out.println(sum);
	}
}
