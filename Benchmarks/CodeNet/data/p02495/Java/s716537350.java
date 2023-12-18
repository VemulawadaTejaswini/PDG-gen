import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String c1 = new String();
		String c2 = new String();
		String co = new String();
		
		c1 = "#";
		c2 = ".";
		
		
		while (true){
			
			
			int H = input.nextInt();
			int W = input.nextInt();
			
			if (H == 0)break;
			
			for (int i = 0; i < H; i++){
				if(i % 2 == 0)co = ".";
				else co = "#";
				
				for (int j = 0; j < W; j++){
					if (co.equals(c1))co = c2;
					else co = c1;
					
					System.out.print(co);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}
}