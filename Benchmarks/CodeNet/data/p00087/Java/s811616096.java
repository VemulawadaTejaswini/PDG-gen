import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[80];
		int count = 0;
		int ans = 0 ;
				
		while(sc.hasNext()){
			String str = sc.next();
			try{
				num[count + 1] = Integer.parseInt(str);
				count++ ;
			}catch(NumberFormatException e){
				ans = operate(num[count - 1], num[count], str);
			}
			
		}
		System.out.println(ans);
	}
	static int operate(int x, int y,String str){
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