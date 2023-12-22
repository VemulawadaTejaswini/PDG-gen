import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int h = x.nextInt();
		int w = x.nextInt();
		
		StringBuilder sb1 = new StringBuilder("");
		
		while(h != 0 || w != 0 ){
				for(int i = 0 ; i < h ; i++){

			for(int n = 0 ; n < w ; n++){
				sb1.append("#");
			}
			sb1.append("\n");
		}
		sb1.append("\n");
		 h = x.nextInt();
		 w = x.nextInt();
		}
		
		System.out.print(sb1);
		
		
		
	}

}