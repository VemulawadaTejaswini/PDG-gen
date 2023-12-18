import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc .nextInt();
		for(;;){
			if(h == 0 && w == 0){
				System.exit(0);
			}
			for (int x = 0; x < h; x++){
				for (int y = 0; y < w; y++) {
					System.out.print("#");
				}
				System.out.println("");
			}
		h = sc.nextInt();
		w = sc.nextInt();
		}
	}
}