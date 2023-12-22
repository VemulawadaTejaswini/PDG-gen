import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			Deque<Integer> operando=new ArrayDeque<>();
			boolean isEOF=false;
			while(sc.hasNext()){
				String order=sc.next();
				boolean isOperator = false;
				String[] Operator= new String[3];
				Operator[0]=new String("+");
				Operator[1]=new String("*");
				Operator[2]=new String("-");
				for(String s: Operator){
					if(order.equals(s)) isOperator=true;
				}
				//if(order.equals("EOF")) isEOF=true;
				if(!isEOF){
					if(isOperator){
						int a = operando.pollFirst();
						int b = operando.pollFirst();
						operando.addFirst(calc(a,b,order));
					}else{
						operando.addFirst(Integer.parseInt(order));
					}
				}
			}
			System.out.println(operando.pollFirst());
		}
	}
	public static int calc(int a, int b, String s){
		int ans=0;
		if(s.equals("+"))ans= a+b;
		if(s.equals("-"))ans= b-a;
		if(s.equals("*"))ans= a*b;
		return ans;
	}
}