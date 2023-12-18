import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stk = new Stack();
		DecimalFormat df = new DecimalFormat("#0.000000");
		double ans = 0;
		while(sc.hasNext()){
			String str = sc.next();

			try {
				stk.push(Double.parseDouble(str));
			} catch (NumberFormatException e) {
				double y =  (double)stk.pop();
				double x =   (double)stk.pop();
				ans = operate(x,y,str);
				stk.push(ans);			}
		}
		System.out.println(df.format(ans));
	}
 
static double operate(double x, double y,String str){
	switch (str) {
	case "+": 
		return x + y;
	case "-":
		return x - y; 
	case "*":
		return x * y;
	case "/":
		return x / y;
	}
	return 0;

}
}