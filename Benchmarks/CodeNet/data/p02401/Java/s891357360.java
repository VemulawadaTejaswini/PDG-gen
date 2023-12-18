import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String m = sc.next();
		int b = sc.nextInt();
		sc.close();
		boolean eter = true;
		while(eter == true){
			if(m == "+"){
				System.out.println(a + b);
			}else if(m == "-"){
				System.out.println(a-b);
			}else if(m == "*"){
				System.out.println(a*b);
			}else if(m == "/"){
				System.out.println(a/b);
			}else if(m == "&" && a-b == 0){
				break;
			}
		}
	}
}