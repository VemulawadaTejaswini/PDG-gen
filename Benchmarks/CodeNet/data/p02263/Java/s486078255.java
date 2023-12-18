import java.util.Scanner;

public class Main {
	static int[] str = new int[300];
	static int i = 0;
	static void push(int k) {
		if (i >=299){
			System.out.print("?????????????????????");
			System.exit(1);
		}else
			i++;
			str[i] = k;
		}
	static int pop() {
		if (i == 0){
			System.out.print("??¢??????????????????");
			System.exit(1);
		}else
		i--;
		return str[i+1];

	}
	static boolean isNumber(String j) {
	    try {
	        Integer.parseInt(j);
	        return true;
	        } catch (NumberFormatException e) {
	        return false;
	    }
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] array = in.nextLine().split(" ");
		int size = array.length;
		for (int h=0;h<size;h++){
			if (array[h].equals("+")){
				int b = pop();
				int c = pop();
				int d = c + b;
				push(d);
			}
			else if (array[h].equals("-")){
				int b = pop();
				int c = pop();
				int d = c - b;
				push(d);
			}
			else if (array[h].equals("*")){
				int b = pop();
				int c = pop();
				int d = c * b;
				push(d);
			}
			else
				if (isNumber(array[h])){
				int k = Integer.parseInt(array[h]);
				push(k);
			}
		}
		System.out.println(str[i]);
	}
}