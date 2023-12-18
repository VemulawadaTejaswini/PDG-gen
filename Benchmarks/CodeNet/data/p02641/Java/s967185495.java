import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int x=sc.nextInt();
		int n=sc.nextInt();		//数字列の長さ

		ArrayList<String>array=new ArrayList<>();
		for(int i=0;i<n;i++) {
			array.add(sc.next());

		}
		if(n==0) {
			System.out.println(x);
		}else {
			int mincount = 0;
			int min = 0;
			for(int i=1;i<=101;i++) {

				String b = Integer.toString(i);


				if(!array.contains(b)) {
					//System.out.println(b);
					int aaa = x-i;
					aaa = Math.abs(aaa);
					if(mincount==0) {
						min = i;
						mincount = aaa;
					}else if(mincount>aaa) {
						mincount = aaa;
						min = i;
					}else if(mincount==aaa) {
						if(min>i) {
							mincount =aaa;
							min = i;

						}
					}

				}

			}
			System.out.println(min);
		}
		//System.out.println(array);
		

		
	}

}