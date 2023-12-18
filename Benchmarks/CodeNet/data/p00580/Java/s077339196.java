import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		List<Integer> player = new ArrayList<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			int country = sc.nextInt();
			for (int i = 0; i < country; i++) {
				int number = sc.nextInt();
				for (int j = 0; j < number; j++)
					player.add(i); //人数分のだけに追加
			}
			int count = 0;
			count = permutationNum(count,player,new ArrayList<Integer>());
			System.out.println(count % 10007);
		}
	}

	static int permutationNum(int count,List<Integer> input, List<Integer> ans) {  //順列の計算（隣は自分より±2でないといけない）
		if (input.size() <= 1) {
			if (ans.size() > 0) {
				int far = Math.abs((input.get(0)- ans.get(ans.size()-1)));
				if (far > 1) {
					count++;
				}
			} else {  //ansが空の場合
				count++;
			}
		} else {
			for (int i=0; i<input.size(); i++) {  //inputの1、2、3…個目を分離して、残りの方に挿入する
				List<Integer> i1 = new ArrayList<Integer>();
				for (int j=0; j<i;j++) i1.add(input.get(j));
				for (int j=i+1; j<input.size();j++) i1.add(input.get(j));
				if (ans.size() > 0) {  //ansは空でない場合
					int last = ans.get(ans.size() - 1);  //ansの最後を取得
					int far = Math.abs(last - input.get(i));
					if (far > 1) {  //これから入れる選手は同じ国、隣国でない場合距離>1
						List<Integer> i2 = new ArrayList<Integer>(ans);
						i2.add(input.get(i));
						count = permutationNum(count ,i1, i2);
					}
				} else {  //空だったら続行
					List<Integer> i2 = new ArrayList<Integer>(ans);
					i2.add(input.get(i));
					count = permutationNum(count ,i1, i2);
				}
			}
		}
		return count;
	}
}
