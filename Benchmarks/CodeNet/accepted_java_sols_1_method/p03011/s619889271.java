import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		int result;

		if(p<=q) {
			result = p;
			if(r<=q){
				result += r;
			}else {
				result += q;
			}
		}else {
			result = q;
			if(r<=p) {
				result += r;
			}else {
				result += p;
			}
		}

		System.out.println(result);
	}

}
