import java.io.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		try {
			String s=args[0];
			int x=Integer.parseInt(s);
			System.out.println(Math.pow(x, 3));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		// TODO 自動生成されたメソッド・スタブ

	}