import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){	
			int a = sc.nextInt();
			String op =sc.next();
			int b = sc.nextInt();
			if("?".equals(op)) break;
			if("+".equals(op)){
				int x = a+b;
				System.out.println(x);
			}else if("-".equals(op)){
					int x = a-b;
					System.out.println(x);
					}else if("*".equals(op)){
						int x = a*b;
						System.out.println(x);
					}else if("/".equals(op)){
							int x = a/b;
							System.out.println(x);
			}
		}
	}	
}