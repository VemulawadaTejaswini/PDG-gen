import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()){
			String[] input = scanner.nextLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[2]);

			if(input[1].equals("+")){
				System.out.println(a+b);
			}else if(input[1].equals("-")){
				System.out.println(a-b);
			}else if(input[1].equals("*")){
				System.out.println(a*b);
			}else if(input[1].equals("/")){
				System.out.println(a/b);
			}else{break;}
		}
	}
}