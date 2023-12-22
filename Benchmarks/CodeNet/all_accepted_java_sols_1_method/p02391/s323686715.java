
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String[] strA = insBR.readLine().split(" ");
			int intA = Integer.parseInt(strA[0]);
			int intB = Integer.parseInt(strA[1]);

			if(intA < intB){
				System.out.println("a < b");
			}else if(intA > intB){
				System.out.println("a > b");
			}else{
				System.out.println("a == b");
			}

		}catch(IOException e){
			System.out.println("入力が無効です。");
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください。");
		}
	}
}

