import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h < 0||h > 300||w < 0||w > 300) continue;
			if(h == 0 && w == 0) break;
			for(int i = 0;i < w;i++) {
				for(int j = 0;j < h;j++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
	}
}