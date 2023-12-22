import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();

		while(true){
			int a = in.nextInt();
			String op = in.next();
			int b = in.nextInt();


			if(op.equals("?")){
				break;
			}else{

				switch(op){
					case "+":
						list.add(a + b);
						break;
					case "-":
						list.add(a - b);
						break;
					case "*":
						list.add(a * b);
						break;
					case "/":
						list.add(a / b);
						break;
				}
			}
		}
		list.forEach(result -> System.out.println(result));

	}

}


