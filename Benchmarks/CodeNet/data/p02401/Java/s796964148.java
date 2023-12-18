import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		
		String str = in.nextLine();
		String[] ary = str.split(" ");
		char c = ary[1].charAt(0);
		
		while(c != '?'){
			int a = Integer.parseInt(ary[0]);
			int b = Integer.parseInt(ary[2]);
			
			switch(c){
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
				default:
					break;
			}
			
			str = in.nextLine();
			String[] ary2 = str.split(" ");
			for(int i=0; i<3; i++){
				ary[i] = ary2[i];
			}
			c = ary[1].charAt(0);
		}
		in.close();
	}
}