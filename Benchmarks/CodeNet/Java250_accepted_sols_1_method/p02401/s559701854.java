
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int a, b, cnt = 0, i;
		String o;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while(cnt < 20000){
			a = sc.nextInt();
			o = sc.next();
			b = sc.nextInt();
			char op = o.charAt(0);
			if(op == '?'){
				break;
			}else{
				switch(op){
					case '+': ans.add(new Integer(a + b));
								break;
					case '-': ans.add(new Integer(a - b));
								break;
					case '*': ans.add(new Integer(a * b));
								break;
					case '/': ans.add(new Integer(a / b));
								break;
				}
			}
			cnt++;		
		}
		for(i = 0; i != cnt; i++){
			System.out.println(ans.get(new Integer(i)));
		}
	}
}