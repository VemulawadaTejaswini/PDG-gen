import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner bui = new Scanner(System.in);
		String n = bui.next();
		if(n.equals("G")){
			System.out.println("C");
		}else if(n.equals("C")){
			System.out.println("G");
		}else if(n.equals("A")){
			System.out.println("T");
		}else if(n.equals("T")){
			System.out.println("A");
		}



	}
}
