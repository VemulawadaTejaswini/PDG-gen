import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n,m,left,right;
			int index,indexL,indexR, result;
			n = sc.nextInt();
			m = sc.nextInt();
			Map <Integer,Integer> mapL = new TreeMap<Integer,Integer> ();
			Map <Integer,Integer> mapR = new TreeMap<Integer,Integer> ();
            indexL=-1;
            indexR=n+1;
			for(index=0;index<m;index++) {
				left = sc.nextInt();
				right = sc.nextInt();
				if(left>indexL) indexL=left;
				if(right<indexR) indexR=right;
			}
			sc.close();
			result=indexR-indexL+1;
			if(indexL>indexR) result=0;
			// 出力
			System.out.println(result);

	}
}