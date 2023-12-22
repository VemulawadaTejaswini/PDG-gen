import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<String> stringList = new ArrayList<>();
		List<String> ansList = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			stringList.add(sc.next()); 
		}
		
		Collections.sort(stringList);
		
		String temp = stringList.get(0);
		int sameCount = 1;
		int maxCount = 0;

		//　最多回数を取得
		for(int i = 1; i < N; i++) {
			if(temp.equals(stringList.get(i))) {
				sameCount++;
			}else {
				if(maxCount < sameCount) {
					maxCount = sameCount;
				}
				sameCount = 1;
				temp = stringList.get(i);
			}
		}
		// 全て同じ文字だった場合の最多回数を取得
		if(maxCount < sameCount) {
			maxCount = sameCount;
		}

		// 最多回数と同じ文字列を取得
		sameCount = 1;
		temp = stringList.get(0);
		for(int i = 1; i < N; i++) {
			if(temp.equals(stringList.get(i))) {
				sameCount++;
			}else {
				if(maxCount == sameCount) {
					ansList.add(temp);
				}
				sameCount = 1;
				temp = stringList.get(i);
			}
		}
		
		// 最後の文字が最多かどうか確認
		if(maxCount == sameCount) {
			ansList.add(temp);
		}

		for(int i = 0; i < ansList.size(); i++) {
			System.out.println(ansList.get(i));
		}
		
		sc.close();
	}
	
}