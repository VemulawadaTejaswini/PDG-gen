import java.util.Stack;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main{
	public static int pop(int[] data,int sp){
		 return data[--sp];	
	}
	public static void push(int[] data,int sp,int value)
	{
		data[sp++] = value;
	}
	public static void main(String[] args) {
		int[] stack = new int[200];
		int sp=0;
		Scanner scan = new Scanner(System.in);
		Pattern p = Pattern.compile("^[0-9]*$");
		while(scan.hasNext()){
			//System.out.println(sp);
			String str = scan.next();
			Matcher m = p.matcher(str);
			if(m.find()){
				push(stack,sp,Integer.parseInt(str));
				sp++;
			}else if(str.equals("+")){
				int a = pop(stack,sp);
				sp--;
				int b = pop(stack,sp);
				sp--;
				push(stack,sp,a+b);
				sp++;
			}else if(str.equals("-")){
				int a = pop(stack,sp);
				int b = pop(stack,sp);
				push(stack,sp,a-b);	
			}else if(str.equals("*")){
				int a = pop(stack,sp);
				int b = pop(stack,sp);
				push(stack,sp,a*b);
			}else if(str.equals("/")){
				int a = pop(stack,sp);
				int b = pop(stack,sp);
				push(stack,sp,a/b);
			}
		}
		System.out.println("Ans:"+stack[0]);
		
	}
}