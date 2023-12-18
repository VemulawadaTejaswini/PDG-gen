import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a,b,c;
		int t=0;
	    try (Scanner sc = new Scanner(System.in)) {
	    	a = sc.nextInt();
	    	b = sc.nextInt();
	    	c = sc.nextInt();
	    }

	    for(int i=a; i<=b; i++) {
	    	if(c%i == 0) {
	    		t++;
	    	}
	    }

	    System.out.println(t);
	}

}

