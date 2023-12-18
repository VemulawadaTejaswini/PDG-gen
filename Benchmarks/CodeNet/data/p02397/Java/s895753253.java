import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String input;
			try {
				input = br.readLine();
				String[] str = input.split(" ");
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				if ((a == 0) && (b == 0)){
					break;
				} else {
					if (a > b){
						int temp;
						temp = b;
						b = a;
						a = temp;
					}
					System.out.println(a + " " + b);
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
}