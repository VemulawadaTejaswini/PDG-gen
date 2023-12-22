import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b= scan.next();

	//	long a = Long.parseLong(aS);
		//long b = Long.parseLong(bS);
		//if(a>0 &&b>0) {
		String ans ="";
			if(a.length()>b.length()) {
				ans ="GREATER";
			}else if(a.length()<b.length()) {
				ans ="LESS";
			}
			if(a.length()==b.length()) {

				for (int i=0;i<a.length();i++) {
					if(a.charAt(i)>b.charAt(i)) {
						ans ="GREATER";
						break;
					}else if(a.charAt(i)<b.charAt(i)) {
						ans ="LESS";
						break;
					}else {
						ans = "EQUAL";

					}

					}


				}
			System.out.println(ans);}

}
