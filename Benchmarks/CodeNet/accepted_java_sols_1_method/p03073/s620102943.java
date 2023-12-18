import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strArray = str.split("");
		List<Integer> list = new ArrayList<Integer>();
		for (int tmp = 0; tmp < strArray.length ; tmp++) {
			list.add(Integer.parseInt(strArray[tmp]));
		}
		int count = 0;
		for(int tmp=0; tmp < list.size(); tmp++) {
			if(list.get(tmp) == 1) {
				count++;
			}
			tmp++;
			if(tmp >= list.size()) {
				break;
			}
			if(list.get(tmp) == 0) {
				count++;
			}
		}
		int countB = 0;
		for(int tmp=0; tmp < list.size(); tmp++) {
			if(list.get(tmp) == 0) {
				countB++;
			}
			tmp++;
			if(tmp >= list.size()) {
				break;
			}
			if(list.get(tmp) == 1) {
				countB++;
			}
		}
		if(count < countB) {
			System.out.println(count);
		}else {
			System.out.println(countB);
		}
	}
}