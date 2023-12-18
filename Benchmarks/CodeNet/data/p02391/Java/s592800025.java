import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a,b;

	    try (Scanner sc = new Scanner(System.in)) {
	    	a = sc.nextInt();
	    	b = sc.nextInt();
	    }

	    if(a<b) {
	    	System.out.println("a < b");
	    }
	    else if(a==b) {
	    	System.out.println("a == b");
	    }
	    else {
	    	System.out.println("a > b");
	    }
	}

}

