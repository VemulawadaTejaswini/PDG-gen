import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[][] array = new int[3][3];
		String s = sc.next();
		List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<String> list_reverse=new ArrayList<String>(Arrays.asList(s.split("")));
		Collections.reverse(list_reverse);
		int a = (list.size()-1)/2;
		if(list.equals(list_reverse)) {
			List<String> list_mae=new ArrayList<String>();
			List<String> list_mae_re=new ArrayList<String>();
			for(int i=0;a>i;i++) {
				list_mae.add(list.get(i));
				list_mae_re.add(list.get(i));
			}
			Collections.reverse(list_mae_re);
			if(list_mae.equals(list_mae_re)) {
				List<String> list_ato=new ArrayList<String>();
				List<String> list_ato_re=new ArrayList<String>();
				for(int j=0;a>j;j++) {
					list_ato.add(list_reverse.get(j));
					list_ato_re.add(list_reverse.get(j));
				}
				Collections.reverse(list_ato_re);
				if(list_ato.equals(list_ato_re)) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}

			}
			else {
				System.out.println("No");
			}

		}
		else {
			System.out.println("No");
		}
	}
}