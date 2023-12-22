import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		ArrayList<Integer> distantList = new ArrayList();
		for(int i = 0;i<line.length;i++) {
			distantList.add(Integer.parseInt(line[i]));
		}
		Collections.sort(distantList);
		System.out.println(distantList.get(0) + distantList.get(1));
		
	}
}
	
	