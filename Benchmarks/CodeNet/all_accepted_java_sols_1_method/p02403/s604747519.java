import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int h,w;
		h = sc.nextInt();
		w = sc.nextInt();
		while(h != 0 && w != 0){
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
			h = sc.nextInt();
			w = sc.nextInt();
		}
	}
}