import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		List<String> list_check=new ArrayList<String>();
		int n= sc.nextInt();
		for(int i=0;n>i;i++) {
			String s = sc.next();
			List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
			Collections.sort(list);
			String check ="";
			for(int j=0;list.size()>j;j++) {
				check=check+list.get(j);
			}
			list_check.add(check);
		}
		long answer=0;
		Collections.sort(list_check);
		//System.out.println(list_check);
		for(int i=0;list_check.size()>i;i++) {
			int count=0;
			for(int j=i+1;list_check.size()>j;j++) {
				if(list_check.get(i).equals(list_check.get(j))) {
					count++;
					answer=answer+count;
				}
				else
					break;
			}
			i=i+count;
		}
		System.out.println(answer);
	}
}