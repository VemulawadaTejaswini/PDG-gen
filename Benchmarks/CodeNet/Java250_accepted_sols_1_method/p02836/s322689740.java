import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		int count=0;
		for(int i=0;i<string.length();i++) {
			list.add(string.substring(i,i+1));
		}
		int a=list.size()/2;
		for(int i=0;i<a;i++) {
			if(list.get(i).equals(list.get(list.size()-i-1))) {
				
			}
			else {
				count++;
			}
		}
      System.out.print(count);
	}

}