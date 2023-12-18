import java.util.Scanner;

public class Main {

    public static void main (String []args){
	Scanner sc =  new Scanner (System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int list [] = new int[3];
	list [0] = a;
	list [1] = b;
	list [2] = c;

	if (a > b){
	    int tmp = a;
	    a = b;
	    b = tmp;
	}

	if (b > c){
	    int tmp = b;
	    b = c;
	    c = tmp;
	}

	if (a > b){
	    int tmp = a;
	    a = b;
	    b = tmp;
	}

	System.out.printf("%d %d %d", a, b, c);
	sc.close();
	

    }
}