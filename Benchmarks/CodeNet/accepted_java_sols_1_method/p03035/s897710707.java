import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = new String(in.readLine());
		String[] input = line.split(" ", 0);
		int age = Integer.parseInt(input[0].trim());
		int price = Integer.parseInt(input[1].trim());
		//System.out.println("入力値は、" + age + "と" + price);
		
			if(age <= 5) {
				System.out.print("0");
			}else if(age <= 12) {
				System.out.print(price / 2);
			}else {
				System.out.print(price);
			}
		} catch (IOException e) {
			System.out.print(e);
		}
	}

}
