import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String[][] array = new String[8][8];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		for(int i=0;list.size()>i;i++) {
			//System.out.println(i);
			if(i%2==0) {
				if(list.get(i).equals("R")||list.get(i).equals("U")||list.get(i).equals("D")){
					continue;
				}
				System.out.println("No");
				System.exit(0);
			}
			else {
				if(list.get(i).equals("L")||list.get(i).equals("U")||list.get(i).equals("D")){
					continue;
				}
				System.out.println("No");
				System.exit(0);
			}
		}

		System.out.println("Yes");

	}

}