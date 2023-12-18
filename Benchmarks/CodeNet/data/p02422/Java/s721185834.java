import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		List<String> list = new ArrayList<>();
		
		try {
			StringBuffer bf = new StringBuffer(br.readLine());
			int q = Integer.parseInt(br.readLine());
			for (int i = 0; i < q; i++) {
				String[] order = br.readLine().split("\\s");
				int a = Integer.parseInt(order[1]);
				int b = Integer.parseInt(order[2]) +1;
				if (order[0] != null) {
					switch (order[0]) {
					case "print" :
						list.add(bf.substring(a, b).toString());
						break;
					case "reverse" :
						bf.replace(a, b, (new StringBuffer(bf.substring(a, b)).reverse()).toString());
						break;
					case "replace" :
						bf.replace(a, b, order[3]);
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

