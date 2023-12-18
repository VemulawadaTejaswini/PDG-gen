import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[])throws IOException{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(true){
			String order = scan.next();
			if(order.equals("quit")){
				break;
			}
			
			else if(order.equals("push")){
				String str = scan.next();
				list.add(str);
			}
			
			else if(order.equals("pop")){
				System.out.println(list.get(list.size() - 1));
				list.remove(list.size() - 1);
			}
		}
		scan.close();
	}
}