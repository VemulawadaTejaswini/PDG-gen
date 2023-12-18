import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char e;
		e=0;
		while(e!=63){
			int a = sc.nextInt();
			char c = sc.next().charAt(0);
			int b = sc.nextInt();
			int d;
			if(c==42){
				d = a*b;
				System.out.printf("%d\n", d);
			}else if(c==43){
				d = a+b;
				System.out.printf("%d\n", d);
			}else if(c==47){
				d = a/b;
				System.out.printf("%d\n", d);
			}else if(c==45){
				d = a-b;
				System.out.printf("%d\n", d);
			}else if(c==63){
				e=c;
			}
		}

	}
}