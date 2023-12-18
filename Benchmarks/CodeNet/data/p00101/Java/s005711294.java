import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		int line = 0;
		Scanner sc = new Scanner(System.in);
		line = sc.nextInt();
		
		List<String> lines = new ArrayList<String>();
		int i=0;
		while(sc.hasNext()) {
			
			String lineData = sc.nextLine();
			if(lineData != null && ! lineData.equalsIgnoreCase("")) {
				 lines.add(lineData); 
				 i ++;
			}
			
			if(i==line) {
				break;
			}
		}
		
		 
		 for(i = 0; i<lines.size(); i++) {
			 System.out.println(lines.get(i).replace("Hoshino", "Hoshina"));
		 }
		

	}

}