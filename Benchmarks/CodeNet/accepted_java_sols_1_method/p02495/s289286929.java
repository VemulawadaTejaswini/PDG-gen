import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h < 0||h > 300||w < 0||w > 300) continue;
			if(h == 0 && w == 0) break;
			for(int i = 0;i < h;i++) {
				for(int j = 0;j < w;j++) {
					int k = i+j;
					if(k % 2 == 0){				
						System.out.print("#");
					}
					else if(k % 2 == 1){				
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}