import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		while(true){
			int h = s.nextInt();
			int w = s.nextInt();
			if(h == 0 && w == 0) break;
			
			for(int i=0; i<h; i++){
				for(int k=0; k<w; k++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}