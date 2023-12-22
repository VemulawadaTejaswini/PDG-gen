import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
	    Integer A = scanner.nextInt();
	    Integer B = scanner.nextInt();
	    Integer C = scanner.nextInt();

	    Integer res1 = A + B;
	    Integer res2 = A + C;
	    Integer res3 = B + C;

	    if(res1<res2) {
	    	if(res1<res3) {
	    		System.out.println(res1);
	    	}else {
	    		System.out.println(res3);
	    	}
	    }else if (res2<res3) {
			System.out.println(res2);
		}else {
			System.out.println(res3);
		}

	}

}