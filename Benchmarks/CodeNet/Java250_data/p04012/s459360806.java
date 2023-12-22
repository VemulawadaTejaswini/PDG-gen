import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num.add(sc.nextInt());
			} else {
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		Map<String, Integer> bottle = new HashMap<String, Integer>();
		String mozi = "";
		boolean cheak = false;

		for (int i = 0; i < param.get(0).length(); i++) {
			mozi = param.get(0).substring(i,i+1);
			if(bottle.containsKey(mozi)){
				bottle.put(mozi,bottle.get(mozi)+1);
			} else {
				bottle.put(mozi,1);			
			}
		}
		for (String key : bottle.keySet()) {
		    if(bottle.get(key) % 2 != 0) cheak = true;
		}
		if(cheak){
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}