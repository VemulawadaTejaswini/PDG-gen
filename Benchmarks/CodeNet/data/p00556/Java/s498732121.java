import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int space = sc.nextInt();
			int type = sc.nextInt();
			int[] shelf = new int[space];
			int[] count = new int[type];
			List<Integer> num = new ArrayList<Integer>(type);
			for (int i=0; i<space; i++) {
				int j =sc.nextInt();
				shelf[i]=j;
				count[j-1]++;
			}
			for (int i=0; i<type; i++) {
				num.add(i);
			}

			List<List<Integer>> p = new ArrayList<List<Integer>>();
			p = permutation2(p,num,new ArrayList<Integer>());
			int min = Integer.MAX_VALUE;
			for (List<Integer> l : p) {
				 int pointer=0;
				 int diff = 0;
				 for (int a:l) {
					 for (int i=pointer; i<pointer+count[a];i++) {
						 if (shelf[i]!=a+1) diff++;
					 }
					 pointer+=count[a];
				 }
				 min = Math.min(min, diff);
			}
			System.out.println(min);
		}
	}

	//数字版（List型）
	static List<List<Integer>> permutation2(List<List<Integer>>list,List<Integer> input, List<Integer> ans) {  //順列で範囲の順番をすべて計算
		if (input.size() <= 1) {
			List<Integer> l = new ArrayList<Integer>(ans); //最後の数字はここでくっつく
			l.addAll(input);
			list.add(l);  //listに組み合わせを追加
		} else {
			for (int i=0; i<input.size(); i++) {  //inputの1、2、3…個目を分離して、残りの方に挿入する
				List<Integer> i1 = new ArrayList<Integer>();
				for (int j=0; j<i;j++) i1.add(input.get(j));
				for (int j=i+1; j<input.size();j++) i1.add(input.get(j));
				List<Integer> i2 = new ArrayList<Integer>(ans);
				i2.add(input.get(i));
				permutation2(list ,i1, i2); //空白を入れる
			}
		}
		return list;
	}
}
