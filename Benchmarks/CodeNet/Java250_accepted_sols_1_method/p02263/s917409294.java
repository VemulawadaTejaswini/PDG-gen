import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] stack = new int[100];
		int sp = 0;
		while(scan.hasNext()){
			String str = scan.next();
			if(str.equals("+")){
				int a = stack[--sp];
				int b = stack[--sp];
				stack[sp++] = a + b;
			}else if(str.equals("-")){
				int a = stack[--sp];
				int b = stack[--sp];
				stack[sp++] = b - a;
			}else if(str.equals("*")){
				int a = stack[--sp];
				int b = stack[--sp];
				stack[sp++] = a * b;
			}else{
				stack[sp++] = Integer.parseInt(str);
			}
		}
		for(int i = 0;i < sp;i++){
			System.out.println(stack[i]);
		}
	}
}