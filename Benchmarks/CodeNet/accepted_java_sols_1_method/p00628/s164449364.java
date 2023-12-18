import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final String str = sc.nextLine();
			
			if("END OF INPUT".equals(str)){
				break;
			}
			
			for(String s : str.split(" ")){
				System.out.print(s.length());
			}
			
			System.out.println();
			
		}
		
	}

}