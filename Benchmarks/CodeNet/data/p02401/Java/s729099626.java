import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean eter = true;
		while(eter == true){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			if(m == "+"){
				System.out.println(a + b);
			}else if(m == "-"){
				System.out.println(a-b);
			}else if(m == "*"){
				System.out.println(a*b);
			}else if(m == "/"){
				System.out.println(a/b);
			}else if(m == "&" && a-b == 0){
				eter = false;
			}
		}
sc.close();
	}
}