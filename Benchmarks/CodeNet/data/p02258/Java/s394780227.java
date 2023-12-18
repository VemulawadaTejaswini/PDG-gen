import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	private static Scanner scanner;
	public static void main(String[] args) {
		int answer = 0;
		int count = 0;
		boolean flag = false;
		List<Integer> list = new ArrayList<Integer>();
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0; i<n; i++){
			list.add(scanner.nextInt());
		}
		List<Integer> distinctList = distinct(list);
		Collections.sort(distinctList);
		if(distinctList.size() > 100)count = 100;
		for(int i=0; i<distinctList.size(); i++){
			int maxIndex = list.lastIndexOf(distinctList.get(distinctList.size() - (i + 1)));
			List<Integer> tmpList = list.subList(0, maxIndex);
			if((!tmpList.isEmpty())){
				if(!flag){
					answer = distinctList.get(distinctList.size() - (i+1)) - Collections.min(tmpList);
					flag = true;
				}
				else if(answer < (distinctList.get(distinctList.size() - (i+1)) - Collections.min(tmpList))){
					answer = distinctList.get(distinctList.size() - (i+1)) - Collections.min(tmpList);
				}
			}
		}
		System.out.println(answer);
	}
	public static List<Integer> distinct(List<Integer> list){
		List<Integer> distictList = new ArrayList<Integer>();
		for(int i: list){
			if(!distictList.contains(i))distictList.add(i);
		}
		return distictList;
	}
}