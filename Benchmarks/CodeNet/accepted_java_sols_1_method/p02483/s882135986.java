import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a<b){
			if(b<c){
				System.out.printf("%d %d %d\n", a, b, c);
			}else if(a<c){
				System.out.printf("%d %d %d\n", a, c, b);
			}else{
				System.out.printf("%d %d %d\n", c, a, b);
			}
		}else{
			if(a<c){
				System.out.println(a+" "+b+" "+c);
			}else if(b<c){
				System.out.println(b+" "+c+" "+a);
			}else{
				System.out.println(c+" "+b+" "+a);
			}
		}
		sc.close();
	}

}