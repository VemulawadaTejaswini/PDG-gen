import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int prior = Integer.parseInt(sc.next());
		int post  = Integer.parseInt(sc.next());
		String notation = "";
		
		notation = prior > post ? ">" : prior == post ? "==" : "<";
		
		System.out.println("a " + notation + " b");
		
		sc.close();
		
	}

}

