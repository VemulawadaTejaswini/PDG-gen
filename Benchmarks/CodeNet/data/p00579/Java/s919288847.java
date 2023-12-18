import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	static long[] beauty;  //美しさ
	static int[] L;
	static int[] R;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int treeNum = sc.nextInt();
			beauty = new long[treeNum];
			boolean[] illumination = new boolean[treeNum];  //イルミネーション trueついてる falseついてない
			int mNum = sc.nextInt();
			L = new int[mNum];
			R = new int[mNum];
			for (int i=0; i<treeNum; i++) {
				beauty[i] = sc.nextLong();  //美しさを読み込み
				illumination[i]  = true;
			}
			for (int i=0; i<mNum; i++) {  //LとRをストック
				L[i] = sc.nextInt()-1;
				R[i] = sc.nextInt()-1;
			}
			List<Long> beautys = new ArrayList<Long>();
			beautys = allPattern(beautys,illumination,0);
			long max_beauty = 0l;
			for (long l : beautys) {
				max_beauty = Math.max(max_beauty, l);
				//System.out.println("beauty   "+l);
			}
			System.out.println(max_beauty);
		}
	}

	public static List<Long> allPattern(List<Long> beautys,boolean[] illu, int pointer){
		if (pointer >= L.length) {  //命令の数
			Long b = 0l;
			for (int i=0; i<beauty.length; i++) {
				//System.out.println(i + "-------" + illu[i]);
				if (illu[i]) {  //ついているなら
					b += beauty[i];  //美しさを加算
				}
			}
			//System.out.println(b);
			beautys.add(b);
		} else {
			for (int i=L[pointer]; i<=R[pointer]; i++) {
				boolean[] copy = new boolean[illu.length];
				for (int j=0; j<illu.length; j++) copy[j] = illu[j];  //コピーする
				//System.out.println(i + "     " + illu[i]);
				for (int j=L[pointer]; j<=R[pointer]; j++) copy[j] = false;  //まず範囲内をイルミネーションを全部消す
				if (illu[i]) {  //すでに消したら処理しない
					copy[i] = true;  //一個ずつつけて再帰する
				}
				allPattern(beautys,copy,pointer+1);
			}

		}
		return beautys;
	}
}
