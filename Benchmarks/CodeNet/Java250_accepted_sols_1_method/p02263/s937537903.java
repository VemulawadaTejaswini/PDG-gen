import java.util.*;

class Main{
	public static void main(String args[]){
		int i;
		int stacksize = 100;
		String temp;
		int calc;
		int a,b;
		Deque<Integer> stack = new ArrayDeque<Integer>();
		String separator = System.getProperty("line.separator");
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.nextLine();
		Scanner sc2 = new Scanner(str);
		sc2.useDelimiter(" ");
		
		while(sc2.hasNext()){
			temp = sc2.next();
			if(temp.equals("+")){
				calc = stack.removeFirst() + stack.removeFirst();
				stack.addFirst(calc);
			}else if(temp.equals("-")){
				a = stack.removeFirst();
				b = stack.removeFirst();
				calc = b - a;
				stack.addFirst(calc);
			}else if(temp.equals("*")){
				calc = stack.removeFirst() * stack.removeFirst();
				stack.addFirst(calc);
			}else{
				stack.addFirst(Integer.parseInt(temp));
			}
		}
		System.out.println(stack.removeFirst());
	}
}