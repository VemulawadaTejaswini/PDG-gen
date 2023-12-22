import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String[] line = sc.nextLine().split(" ");
		
		ArrayList<Integer> inputRowList = new ArrayList();
		for(int i = 0;i<line.length;i++) {
			inputRowList.add(Integer.parseInt(line[i]));
		}
		
		ArrayList<Integer> orderedList = (ArrayList<Integer>) inputRowList.clone();
		Collections.sort(orderedList);
		
		int count = 0;
		for(int i = 0;i<inputRowList.size();i++) {
			if(inputRowList.get(i) != orderedList.get(i)) {
				count++;
			}
		}
		
		String result = "";
		if(count <= 2) {
			result = "YES";
		}else {
			result = "NO";
		}
		System.out.println(result);
		
		
		
	}
}