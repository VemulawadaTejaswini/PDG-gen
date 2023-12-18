import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			String target = "";
			for (int i = 0; i < n; i++) {
				target += sc.nextInt();
				if (i != n-1) target += " ";  //空白を入れる
			}
			String a = "";
			for (int i=1; i<n+1; i++) a += i;
			List<String> list = new ArrayList<String>();
			list = permutation(list,a,"");

			//結果出力---------------------------------------------------
			int index = -1;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(target)){
					index = i;
					break;
				}
			}
 			if (index != 0) System.out.println(list.get(index - 1));  //前の順列が存在したら出力する
 			System.out.println(list.get(index));  //与えられた数列を出力する
 			if (index != list.size()-1) System.out.println(list.get(index + 1));  //次の順列が存在したら出力する
    	}
  }

    static List<String> permutation( List<String> list,String input, String ans){
    	//1まで削ったらその回を終了して、答えをListに入れる
    	if (input.length() <= 1) {
    		list.add(ans + input);  //最後の数字はここでくっつく
    	} else {
    		for (int i=0; i<input.length(); i++) {  //inputの1、2、3…char目を分離して、残りの方に挿入する
    			permutation(list ,input.substring(0, i) + input.substring(i + 1), ans + input.charAt(i) + " "); //空白を入れる
    		}
    	}
    	return list;
    }
}
