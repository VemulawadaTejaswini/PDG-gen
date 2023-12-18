import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StackImpl e = new Main().new StackImpl();
//		while(s.hasNext()) {
			String[] line = s.nextLine().split(" ");
			for(int i=0 ; i<line.length ; i++) {
			if("+".equals(line[i])) {
				int b = e.pop();
				int a = e.pop();
				e.push(a+b);
			} else if("-".equals(line[i])) {
				int b = e.pop();
				int a = e.pop();
				e.push(a-b);
			} else if("*".equals(line[i])) {
				int b = e.pop();
				int a = e.pop();
				e.push(a*b);
			}else {
				e.push(new Integer(line[i]).intValue());
			}
//			}
		}
		System.out.println(e.pop());
	}

	public class StackImpl {

		int[] stack;
		int index;

		public StackImpl() {
			stack = new int[100];
			index = 0;
		}

		public void push(int value) {
			stack[index] = value;
			index++;
		}

		public int pop() {
			index--;
			int returnV = stack[index];
			stack[index] = 0;
			return returnV;
		}
	}
}