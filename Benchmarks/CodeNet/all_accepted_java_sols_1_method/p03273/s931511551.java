import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		List<String> squareInfo = new ArrayList<String>();
		for(int i=0;i < h;i++) {
			String line = sc.next();
			if(!line.matches("\\.+")) {
				squareInfo.add(line);
			}
		}
		List<Integer> deleteInfo = new ArrayList<Integer>();
		for(int i =0; i < w; i++) {
			boolean deleteFlag = true;
			for(int j =0; j < squareInfo.size(); j++) {
				if(squareInfo.get(j).substring(i,i+1).equals("#")) {
					deleteFlag = false;
				}
			}
			if(deleteFlag) {
				deleteInfo.add(i);
			}
		}
		for(int i = 0; i < squareInfo.size(); i++) {
			StringBuilder sb = new StringBuilder();
			for(int j =0; j < w; j++) {
				if(deleteInfo.indexOf(j) ==-1) {
					sb.append(squareInfo.get(i).substring(j,j+1));
				}
			}
			System.out.println(sb);
		}
	}
}