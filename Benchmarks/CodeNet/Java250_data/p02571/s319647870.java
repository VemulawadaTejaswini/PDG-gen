import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();
		scan.close();

		int Slength = S.length();
		int Tlength = T.length();

		ArrayList<String> SstrArray = new ArrayList<String>();

		for (int i = 0; i <= (Slength - Tlength); i++) {
			String Sstr = S.substring(i, Tlength + i);
			SstrArray.add(Sstr);
		}


		String[] Tarray = T.split("");
		int count = 0;
		int[] countArray = new int[SstrArray.size()];


		for (int j = 0; j < SstrArray.size(); j++) {
			String[] SstrArray2 = SstrArray.get(j).split("");
			for (int k = 0; k < Tarray.length; k++) {
				if (!(Tarray[k].equals(SstrArray2[k]))) {
					count = count + 1;
				}
			}
			countArray[j] = count;
			count = 0;
		}

		int countMin = countArray[0];
		for(int m = 0; m < countArray.length; m++) {
			if(countMin > countArray[m]) {
				countMin = countArray[m];
			}
		}

		System.out.println(countMin);

	}

}
