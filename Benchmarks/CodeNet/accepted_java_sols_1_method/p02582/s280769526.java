import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		if(s.equals("SSS")){
			System.out.println("0");
		}else if(s.equals("RSS")){
			System.out.println("1");
		}else if(s.equals("SRS")){
			System.out.println("1");
		}else if(s.equals("SSR")){
			System.out.println("1");
		}else if(s.equals("RSR")){
			System.out.println("1");
		}else if(s.equals("RRS")){
			System.out.println("2");
		}else if(s.equals("SRR")){
			System.out.println("2");
		}else if(s.equals("RRR")){
			System.out.println("3");
		}
	}

}
