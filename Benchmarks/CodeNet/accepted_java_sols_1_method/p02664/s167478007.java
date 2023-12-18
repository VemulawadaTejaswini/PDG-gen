import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		sc.close();

		int len = t.length();

		if(len==1) {
			if(t.equals("?")) {
				System.out.println("D");
			}else {
				System.out.println(t);
			}
			return;
		}

		String[] array = t.split("");
		int i = 0;
		if(array[i].equals("?")) {
			array[i] = "D";
		}

		for(i=1;i<len-1;i++) {
//			String str1 = array[i-1];
			if(array[i].equals("?")) {
				if(array[i-1].equals("P")) {
					array[i] = "D";
				}else {
					if(array[i+1].equals("P")) {
						array[i] = "D";
					}else {
						array[i] = "P";
					}
				}
			}
		}

		i = len - 1;
		if(array[i].equals("?")) {
			array[i] = "D";
		}
		System.out.println(String.join("",array));
	}
}
