import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(;;){
			String x = sc.next();
			if(x.equals("0"))break;
			String[] strArray = x.split("");
			int add = 0;
			for (int i = 0; i < strArray.length; i++) {
				int num = Integer.parseInt(strArray[i]);
			    add += num;
			}
			System.out.println(add);
		}
	}	
}