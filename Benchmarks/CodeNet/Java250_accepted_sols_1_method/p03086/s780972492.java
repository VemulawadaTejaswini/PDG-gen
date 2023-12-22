import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String[] array = s.split("");

		int ans = 0;
		for(int i=0;i<array.length;i++) {
			String tmp1 = array[i];
			if(tmp1.equals("A")||tmp1.equals("C")||tmp1.equals("G")||tmp1.equals("T")) {
				int ans1 = 0;
				for(int j=i;j<array.length;j++) {
					tmp1 = array[j];
					if(tmp1.equals("A")||tmp1.equals("C")||tmp1.equals("G")||tmp1.equals("T")) {
						ans1++;
						ans = Math.max(ans, ans1);
					}else {
						ans = Math.max(ans, ans1);
						ans1 = 0;
					}
				}
			}
		}
		System.out.println(ans);

	}
}