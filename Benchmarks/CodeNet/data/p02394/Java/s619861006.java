import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int w = sc.nextInt();
			int h = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int r = sc.nextInt();
			
			// 円の中心が存在するべき仮想的な長方形
			int[] virt_rectangle = {r,r,w-r,h-r};
			
			if(	virt_rectangle[0] <= x &&
				virt_rectangle[1] <= y &&
				virt_rectangle[2] >= x &&
				virt_rectangle[3] >= y) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}
	}
}
