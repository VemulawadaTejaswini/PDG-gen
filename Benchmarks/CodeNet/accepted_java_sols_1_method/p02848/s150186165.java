import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		String s = sc.next();
		List<String> list_al=new ArrayList<String>();
		list_al.add("A");
		list_al.add("B");
		list_al.add("C");
		list_al.add("D");
		list_al.add("E");
		list_al.add("F");
		list_al.add("G");
		list_al.add("H");
		list_al.add("I");
		list_al.add("J");
		list_al.add("K");
		list_al.add("L");
		list_al.add("M");
		list_al.add("N");
		list_al.add("O");
		list_al.add("P");
		list_al.add("Q");
		list_al.add("R");
		list_al.add("S");
		list_al.add("T");
		list_al.add("U");
		list_al.add("V");
		list_al.add("W");
		list_al.add("X");
		list_al.add("Y");
		list_al.add("Z");
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		for(int i=0;list.size()>i;i++) {
			int a = list_al.indexOf(list.get(i));
			int go = a+n;
			if(go>25)
				go=go-26;
			list.set(i, list_al.get(go));
		}
		for(int i=0;list.size()>i;i++) {
			System.out.print(list.get(i));
		}

	}
}