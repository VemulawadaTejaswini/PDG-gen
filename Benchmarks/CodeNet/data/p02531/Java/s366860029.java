import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		while(true){
			String[] s = sc2.nextLine().trim().split("[\\s]+");
			if(s[0].equals("quit")) break;
			switch(s[0]){
				case "push":
					list.add(s[1]);
					break;
				case "pop":
					list.remove(0);
					break;
			}
		}
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}