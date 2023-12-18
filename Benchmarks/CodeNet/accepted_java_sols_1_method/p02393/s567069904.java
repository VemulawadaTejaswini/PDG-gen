import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        int c = sc.nextInt();

		if(a>b){
            int t = a;
            a = b;
            b = t;
        }
        if(b>c){
            int x = c;
            c = b;
            b = x;
        }
        if(a>b){
            int y = a;
            a = b;
            b = y;
        }
        System.out.println(a+" "+b+" "+c);


	}
}
