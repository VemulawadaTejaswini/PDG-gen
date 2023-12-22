
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		Collections.sort(list);
		List<Text> ans = new ArrayList<>();
		int max = 0;
		int num = 0;
		String b = "";
		for(String e : list) {
			if(ans.isEmpty()) {
				ans.add(new Text(e, 1));
				num++;
				continue;
			} else {
				Text ee = ans.get(ans.size() - 1);
				if(ee.getS().equals(e)) {
					ans.get(ans.size() - 1).setNum(ans.get(ans.size() - 1).getNum() + 1);
					num++;
				} else {
					max = Math.max(max, num);
					ans.add(new Text(e, 1));
					num = 1;
				}
			}
		}
		max = Math.max(max, num);
		for(Text e : ans) {
			if(e.getNum() == max) {
				System.out.println(e.getS());
			}
		}
	}

}

class Text {
	private String s;
	private int num;

	protected Text(String s, int num) {
		super();
		this.s = s;
		this.num = num;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}