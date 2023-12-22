import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int c = Integer.valueOf(a + b);
	    int d =(int) Math.floor(Math.sqrt(c));
        if(c == d * d){ 
        		System.out.println("Yes");
        	}else {
        		System.out.println("No");
        	}
	}

}