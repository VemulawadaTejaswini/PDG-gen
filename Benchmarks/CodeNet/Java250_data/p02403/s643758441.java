import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String h = scanner.nextLine();
		
		String[]temp =h.split(" ");
		int W = Integer.parseInt(temp[0]);
		int H = Integer.parseInt(temp[1]);
		
		
		while((300 >= W  && 1 <= W )&&(300>= H  &&1 <= H )){
			
			for (int x=0;x<W;x++){
				for (int y=1;y<H;y++){
					System.out.print("#");}
					System.out.println("#");}
			 System.out.println("");
			  h = scanner.nextLine();
				
				String[]temp1 =h.split(" ");
			 W = Integer.parseInt(temp1[0]);
			 H = Integer.parseInt(temp1[1]);
			}
	}
}