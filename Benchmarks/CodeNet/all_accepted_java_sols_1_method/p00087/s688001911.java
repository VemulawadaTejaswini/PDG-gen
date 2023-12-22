import java.util.Scanner;
import java.util.Stack;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner scan = new Scanner(System.in);

		while(scan.hasNextLine()){
			Stack<Double> stk = new Stack<Double>();
			String[] lt = scan.nextLine().split(" ");

			for(int i=0;i<lt.length;i++){
				try{
					stk.push(Double.parseDouble(lt[i]));
				}
				catch(Exception e){
					double b = stk.pop();
					double a = stk.pop();

					switch(lt[i].charAt(0)){
					case '+': stk.push(a+b); break;
					case '-': stk.push(a-b); break;
					case '*': stk.push(a*b); break;
					case '/': stk.push(a/b); break;
					}
				}
			}

			System.out.println(stk.pop());
		}
	}

}