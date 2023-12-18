import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		while(true){
			String[] s = sc2.nextLine().trim().split("[\\s]+");
			if(s[0].equals("quit")) break;
			else if(s[0].equals("push")) list.add(s[1]);
			else if(s[0].equals("pop")) {
				list2.add(list.get(list.size()-1));
				list.remove(list.size()-1);
			}
		}
		
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
	}
}