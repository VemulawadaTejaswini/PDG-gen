import java.util.Scanner;

class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp;
        if(a > b) {
        	 = a;
        	a = b;
        	b = p;
        	}
        if(b > c) {
        	p = b;
        	b = c;
        	c = p;
        	}
        if(a > b) {
        	p = a;
        	a = b;
        	b = p;
        	}
        System.out.println( a + " " + b + " " + c );
	}

}
