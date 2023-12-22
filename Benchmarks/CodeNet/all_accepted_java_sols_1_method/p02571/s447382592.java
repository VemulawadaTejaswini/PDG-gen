import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int count = 0;
		int countDummy = 0;
		for(int i = 0; i<s.length()-t.length()+1; i++) {
				String sDummy = s.substring(i, i+t.length());
				for(int j=0; j<t.length(); j++) {
					if(sDummy.charAt(j)==t.charAt(j)) {
						countDummy++;
					}
		}
				if(countDummy > count) {
					count = countDummy;
				}
				countDummy = 0;
			
			
		}

		
		System.out.println(t.length()-count);
		}

}