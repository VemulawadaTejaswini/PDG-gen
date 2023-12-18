import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int Xjuku;
		int Yjuku;
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		Xjuku = x - r;
		Yjuku = y - r;
		if(Xjuku < 0){
			System.out.println("No");
		}else if(Yjuku < 0){
			System.out.println("No");
		}else{
			Xjuku = x + r;
			Yjuku = y + r;
			if(Xjuku >= W){
				System.out.println("No");
			}else if(Yjuku >= H){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}
	}
}
