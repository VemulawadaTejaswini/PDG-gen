import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		char[] sArray = s.toCharArray();
		int[] L = new int[26];
		int[] R = new int[26];

		int countMax = 0;

		//LR配列の初期化
		L[sArray[0]-'a']=1;
		for(int i=1;i<n;i++) {
			R[sArray[i]-'a']=R[sArray[i]-'a']+1;
		}

		for(int i=1;i<n;i++) {
			//LR配列の更新
			L[sArray[i]-'a']=L[sArray[i]-'a']+1;
			R[sArray[i]-'a']=R[sArray[i]-'a']-1;

			//種類数カウント,更新
			int count=0;
			for(int j=0;j<L.length;j++) {
				if(L[j] !=0 && R[j] !=0) count++;
			}
			if (countMax < count) {
				countMax = count;
			}
		}
		System.out.println(countMax);
	}
}
