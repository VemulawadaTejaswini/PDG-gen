import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		while(true){
			String str[] = scan.nextLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[2]);
			if("?".equals(str[1])) break;
			if("+".equals(str[1])){
				System.out.println(a+b);
			} else if("-".equals(str[1])){
				System.out.println(a-b);
			} else if("*".equals(str[1])){
				System.out.println(a*b);
			} else if("/".equals(str[1])){
				System.out.println(a/b);
			}
		}
	}
} 