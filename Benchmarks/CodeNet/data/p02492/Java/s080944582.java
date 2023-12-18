import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	private static void print() {
		 try {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String str = br.readLine();

		 while(str != null){

			 String[] dataSet = str.split(" ", 0);
			 int a = Integer.parseInt(dataSet[0]);
			 String sign = dataSet[1];
			 int b = Integer.parseInt(dataSet[2]);

			 if(sign.equals("+")){
				 System.out.println(a + b);
			 }else if(sign.equals("-")){
				 System.out.println(a - b);
			 }else if(sign.equals("*")){
				 System.out.println(a * b);
			 }else if(sign.equals("/")){
				 System.out.println(a / b);
			 }else {
				break;
			}
			 str = br.readLine();
		 }


		 } catch (IOException e) {
		 e.printStackTrace();
		 }
	}
}