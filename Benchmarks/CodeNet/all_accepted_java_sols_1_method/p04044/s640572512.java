
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String[] firstLineValues = sc.nextLine().split(" ");

      	List<String> list = new ArrayList<String>();
      	for(int i = 0; i < Integer.parseInt(firstLineValues[0]); i++) {
      		list.add(sc.nextLine());
      	}
      	StringBuilder sb = new StringBuilder();
      	while(list.size() > 0) {
      		String tag = "";
      		for(String str: list) {
      			if(tag.isEmpty()) {
      				tag = str;
      				continue;
      			}
      			for(int i = 0; i < str.length(); i++) {
      				if(tag.charAt(i) > str.charAt(i)) {
      					tag = str;
      					break;
      				}
      				if(tag.charAt(i) < str.charAt(i)) {
      					break;
      				}
      			}
      		}
      		sb.append(tag);
      		list.remove(tag);
      	}
      	System.out.println(sb.toString());

	}

}
