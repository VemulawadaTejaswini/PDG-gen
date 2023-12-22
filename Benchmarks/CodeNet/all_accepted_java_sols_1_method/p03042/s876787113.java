import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_gold=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		String mae=list.get(0)+list.get(1);
		String ato=list.get(2)+list.get(3);
		if(Integer.parseInt(mae)>0&&Integer.parseInt(mae)<13) {
			if(Integer.parseInt(ato)>0&&Integer.parseInt(ato)<13) {
				System.out.println("AMBIGUOUS");
			}
			else {
				System.out.println("MMYY");
			}
		}
		else {
			if(Integer.parseInt(ato)>0&&Integer.parseInt(ato)<13) {
				System.out.println("YYMM");
			}
			else {
				System.out.println("NA");
			}
		}
	}

}

