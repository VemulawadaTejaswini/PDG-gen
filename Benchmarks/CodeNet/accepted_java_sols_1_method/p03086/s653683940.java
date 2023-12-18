import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list_count=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		int answer=0;
		for(int i=0;list.size()>i;i++) {
			int count=0;
			while(true) {
				if(list.get(i).equals("A")||list.get(i).equals("C")||list.get(i).equals("G")
						||list.get(i).equals("T")){
					count++;
				}
				else {
					break;
				}
				i++;
				if(i==list.size())
					break;
			}
			list_count.add(count);
		}
		System.out.println(Collections.max(list_count));
	}
}

