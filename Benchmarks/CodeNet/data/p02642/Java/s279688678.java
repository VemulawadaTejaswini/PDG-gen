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
		list2 = list.stream().sorted().collect(Collectors.toList());
		
		for(int j=0; j<list2.size();j++){
			for(int i=0; i<list2.size();i++){
				if(j==i)continue;
				if(list2.get(i) ==list2.get(j)){
					list2.remove(j);
					list2.remove(i);
					break;
				}
				if(list2.get(i)%list2.get(j) == 0){
					list2.remove(i);
					i--;
				}
			}
		}
		System.out.println(list2.size());
	}
}
