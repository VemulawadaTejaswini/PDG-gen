import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int i;

			if(a==0 && b==0) break;
			else if(a > b){
				i = a;
				a = b;
				b = i;
			}
			System.out.printf("%d %d\n", a, b);
	}
	}
}