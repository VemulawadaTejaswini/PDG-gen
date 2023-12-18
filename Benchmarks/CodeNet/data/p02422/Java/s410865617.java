import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = null;
		StringBuffer bf = new StringBuffer();
		List<String> list = new ArrayList<>();
		
		try {
			word = br.readLine();
			int q = Integer.parseInt(br.readLine());
			for (int i = 0; i < q; i++) {
				String[] order = br.readLine().split("\\s");
				int a = Integer.parseInt(order[1]);
				int b = Integer.parseInt(order[2]);
				if (order[0] != null) {
					switch (order[0]) {
					case "print" :
						list.add(word.substring(a, b+1));
						break;
					case "reverse" :	
						word = (bf.append(word.substring(a, b+1)).reverse()).toString() + word.substring(b, word.length());
						bf.setLength(0);
						break;
					case "replace" :
						bf.append(word);
						word = (bf.replace(a, b+1, order[3])).toString();
						bf.setLength(0);
						break;
					default :
						break;
					}
				}
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}

