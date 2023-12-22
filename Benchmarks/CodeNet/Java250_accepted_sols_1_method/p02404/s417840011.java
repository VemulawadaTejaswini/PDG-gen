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
					if(i == h || i == 1){
						System.out.print("#");
					}
					else if(i != 1 || i != h){
						if(v == 1 || v == w){
							System.out.print("#");
						}
						else if(v != 1 || v != w){
							System.out.print(".");
						}
					}
				}
					System.out.println("");
		}
				System.out.println("");
	}
}
}