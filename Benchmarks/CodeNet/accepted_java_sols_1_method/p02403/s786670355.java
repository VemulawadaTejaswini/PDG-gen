import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> rows = new ArrayList<>();
		List<Integer> columns = new ArrayList<>();
		boolean flag=true;
		
		while (true) {
			int h = s.nextInt();
			int w = s.nextInt();
			if(h==0 && w==0) {
				break;
			}
			if(h>=1 && w>=1 && h<=300 && w<=300) {
				rows.add(h);
				columns.add(w);
			}else {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
		for(int i=0;i<rows.size();i++) {
			for(int r=0;r<rows.get(i);r++) {
				for(int c=0;c<columns.get(i);c++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
		}
	}

}