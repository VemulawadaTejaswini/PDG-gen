
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int n=stdin.nextInt();
		int l=stdin.nextInt();
		int i;
		StringBuilder sb=new StringBuilder();
		List<String> list=new ArrayList<String>();
		for(i=0;i<n;i++){
			list.add(stdin.next());
		}
		Collections.sort(list);
		for(i=0;i<n;i++){
			sb.append(list.get(i));

		}
		System.out.println(sb);
	}
}