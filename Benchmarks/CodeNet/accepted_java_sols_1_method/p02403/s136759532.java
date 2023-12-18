import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i,v;
		for(;;){
			int h = scan.nextInt();
			int w = scan.nextInt();
			if(h == 0 && w == 0)
				break;
			for(i = 1; i <= h; ++i){
				for(v = 1; v <= w; ++v){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}	