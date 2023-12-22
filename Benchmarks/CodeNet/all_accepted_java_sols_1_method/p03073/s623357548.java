import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String[] strArray = s.split("");
		ArrayList<Integer> a= new ArrayList<Integer>();
		ArrayList<Integer> b= new ArrayList<Integer>();

		for(int i =0; i < strArray.length; i++) {
			int n = Integer.parseInt(strArray[i]);
			if((i%2==0 && n ==0) ||  (i%2==1 && n ==1)) {
				a.add(n);
			}else {
				b.add(n);
			};
		}

		if (a.size() < b.size()) {
			System.out.println(a.size());
		}else {
			System.out.println(b.size());
		}
	}
}