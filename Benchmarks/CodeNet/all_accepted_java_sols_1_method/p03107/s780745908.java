import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
		String a=scan.next();
		int count=0;
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<a.length();i++) {
			list.add(Integer.valueOf(a.charAt(i)));
		}
		for(int i=0;i<list.size()-1;) {
			if(list.get(i)!=list.get(i+1)) {
				count+=2;
				list.remove(i);
				list.remove(i);
				i=0;
			}
			else {
				i++;
			}
		}
		System.out.println(count);
	}
}
