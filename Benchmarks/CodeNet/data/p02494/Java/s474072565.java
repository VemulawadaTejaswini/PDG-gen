import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		while(h!=0||w!=0){
			for (int y = 0; y < h; y++){
				for (int x = 0; x < w-1; x++){
					System.out.print("#");
				}
			System.out.println();
			}
		h = sc.nextInt();
		w = sc.nextInt();
		}
	}
}