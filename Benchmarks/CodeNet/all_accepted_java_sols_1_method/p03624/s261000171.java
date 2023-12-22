import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] hanteisplit = S.split("");


		String aOfZ = "abcdefghijklnmopqrstuvwxyz";
		String[] aOfZsplit = aOfZ.split("");

		int countnai = 0;
		for(int a = 0;a < aOfZsplit.length;a++) {
			for(int ii = 0;ii < hanteisplit.length;ii++) {
				//aとhanteisplitの比較
				if(!(hanteisplit[ii].equals(aOfZsplit[a]))){
					countnai++;
					//System.out.println(aOfZsplit[a]+ " " + countnai);

				}
			}
			//文字列全部違う
			if(countnai == hanteisplit.length) {
				System.out.println(aOfZsplit[a]);
				System.exit(0);
				break;
			}
			countnai = 0;
		}
		System.out.println("None");
	}

}