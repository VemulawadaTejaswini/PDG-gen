import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList();
		List<Integer> list2 = new ArrayList();
		
		for(int i=0; i<N; i++){
			list.add(Integer.parseInt(sc.next()));
		}
		Collections.sort(list);
		
		for(int j=0; j<list.size();j++){
			for(int i=0; i<list.size();i++){
				if(j==i)continue;
				// 数字被り削除
				if(list.get(i) ==list.get(j)){
					int aa = list.get(i);
					list.remove(j);
					if(!list2.contains(aa)){
						list2.add(aa);
					}
					continue;
				}
				// 割り切れる場合削除
				if(list.get(i)%list.get(j) == 0){
					list.remove(i);
					i--;
				}
			}
		}
		// 数字被り削除
		for(Integer b:list2){
			list.remove(list2.indexOf(b));
		}
		System.out.println(list.size());
		
	}
}
