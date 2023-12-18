import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				String s = sc.nextLine();
				if(s.equals("END OF INPUT"));
				String[] str = s.split(" ");
				
				for(String a:str) {		//str[]の全長までaにいれて回す
					System.out.print(a.length());
				}
				System.out.println();
			}
		}
	}
}

