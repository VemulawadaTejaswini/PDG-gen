import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		
		if(line.equals("RRR")) {
			System.out.println(3);
		}else if(line.equals("SSS")) {
			System.out.println(0);
		}else if(line.equals("RSS") ||line.equals("SSR")){
			System.out.println(2);
		}else {
			System.out.println(1);
		}
	
		
		
	}

}
