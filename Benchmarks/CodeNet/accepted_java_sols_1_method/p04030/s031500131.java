import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(System.in);
		String line;
		for (; cin.hasNext();) {
			line = cin.nextLine();
			String[] s = line.split(" ");
			String S = s[0]; // 文字列

			ArrayList<String> list = new ArrayList<String>();
			String[] ar = S.split("");

			for(String str : ar){
				switch(str){
				case "0":
					list.add("0");
					break;
				case "1":
					list.add("1");
					break;
				case "B":
					if(!list.isEmpty()){
						list.remove(list.size() - 1);
					}
					break;
				default:
					//何もしない
				}
			}

			String result = "";
			for(String word : list){
				result += word;
			}
			System.out.println(result);

		}
	}
}
