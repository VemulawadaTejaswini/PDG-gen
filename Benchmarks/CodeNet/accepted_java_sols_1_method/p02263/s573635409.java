import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		LinkedList<Integer> S = new LinkedList<Integer>();
		String x;
		while(sc.hasNext()){
			x=sc.next();
			if(x.charAt(0)=='+'){
				int a=(int) S.pop();
				int b=(int) S.pop();
				S.push(a+b);
			}
			if(x.charAt(0)=='-'){
				int a=(int) S.pop();
				int b=(int) S.pop();
				S.push(b-a);
			}
			if(x.charAt(0)=='*'){
				int a=(int) S.pop();
				int b=(int) S.pop();
				S.push(a*b);
			}else if('0'<=x.charAt(0) && x.charAt(0)<='9'){
				S.push(Integer.parseInt(x));
			}
		}
		System.out.println(S.pop());
	}

}