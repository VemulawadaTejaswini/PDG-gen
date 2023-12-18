import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Scanner;
public class Main {

	private static Object stack[];
	private static int sp;

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		String[] item = sc.nextLine().split(" ");
		int x = item.length;

		sp = 0;
		stack = new Object[x]; // スタックの生成

		for(int i=0;i<x;i++) {
			if(item[i].equals("+")) {
				int b = new Integer(pop().toString()).intValue();
				int a = new Integer(pop().toString()).intValue();
				push(a+b);
			}else if(item[i].equals("-")){
				int b = new Integer(pop().toString()).intValue();
				int a = new Integer(pop().toString()).intValue();
				push(a-b);
			}else if(item[i].equals("*")){
				int b = new Integer(pop().toString()).intValue();
				int a = new Integer(pop().toString()).intValue();
				push(a*b);
			}else {
				push(item[i]);
			}
		}

		System.out.println(stack[0]);
		sc.close();
	}

	/*
	 * スタックから取り出す
	 */
	public static Object pop() {
		if(sp<0) {
			throw new EmptyStackException();
		}
		Object value = stack[--sp];
		stack[sp] = null;
		return value;
	}

	/*
	 * スタックに追加する
	 */
	public static void push(Object x) {
		if(sp>=200) {
			throw new IllegalStateException("StackOverFlow");
		}
		stack[sp++] = x;
	}
}
