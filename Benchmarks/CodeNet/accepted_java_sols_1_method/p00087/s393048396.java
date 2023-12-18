import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[] stack = new double[40];
		int sp = 0;
		double a;
		double b;
		while(scan.hasNext()){
			sp = 0;
			String[] str = scan.nextLine().split(" ");
			for(int i = 0;i < str.length;i++){
				if(str[i].equals("+")){
					a = stack[--sp];
					b = stack[--sp];
					stack[sp++] = a + b;
				}else if(str[i].equals("-")){
					a = stack[--sp];
					b = stack[--sp];
					stack[sp++] = b - a;
				}else if(str[i].equals("*")){
					a = stack[--sp];
					b = stack[--sp];
					stack[sp++] = a * b;
				}else if(str[i].equals("/")){
					a = stack[--sp];
					b = stack[--sp];
					stack[sp++] = b / a;
				}else{
					stack[sp++] = Double.parseDouble(str[i]);
				}
			}
			System.out.printf("%.6f\n",stack[0]);
		}
	}
}