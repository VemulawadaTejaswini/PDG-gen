import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();


			long count = 0;

			for(int C = 1;N-C>0;C++) {
				count+=(long)enum_div(N-C).size();
			}

			System.out.println(count);

		}


	}

	private static ArrayList<Integer> enum_div(int n){//数字１〜ｎまでの約数を全部Allaylistに詰め込むメソッド
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i = 1;i*i<=n;i++) {
			if(n%i==0) {
				ret.add(i);
				if(i*i!=n){
					ret.add(n/i);
				}
			}
		}

		//ただここまでだと格納した約数はソートされてない

		Collections.sort(ret);//int型、Sting型くらいの格納した奴ならコレクションクラスのソートが使える。
		//ソートしてからcollections.reverseつかえば降順にもできる
		return ret;



	}


}
