import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] c = new int[20000];
		int i = 0;
		int d = 0;
		
		while(d==0){
			int a = scan.nextInt();
			String op = scan.next();
			int b = scan.nextInt();
			
			if (op.equals("+")){
				c[i] = a + b;}
			else if (op.equals("-")){
				c[i] = a - b;}
			else if (op.equals("*")){
				c[i] = a * b;}
			else if (op.equals("/")){
				c[i] = a / b;}
			else{
				break;}
			
			i++;}
			
		for (int q=0; q<i; q++){
			System.out.println(c[q]);}
	}
}
