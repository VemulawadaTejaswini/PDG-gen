import java.util.Scanner;
class Main {
	int W,H,x,y,r;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		W = sc.nextInt();
		H = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		r = sc.nextInt();
		if(x < W && y < H){
			if(r <= x && r <= y){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
		}
	}
	public static void main(String[] args){
		new Main().suzuki();
	}

}