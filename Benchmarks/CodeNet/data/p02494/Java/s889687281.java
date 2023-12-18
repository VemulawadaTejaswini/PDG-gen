import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc .nextInt();
		while(h!=0 || w!=0){
			for (int y = 0; y < h; y++){
				for (int x = 0; x < w; x++) {
					System.out.print("#");
				}
				System.out.print("\n");
			}
		h = sc.nextInt();
		w = sc.nextInt();
		}
	}
}