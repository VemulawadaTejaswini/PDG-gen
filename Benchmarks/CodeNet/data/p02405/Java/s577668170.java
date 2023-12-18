import java.util.Scanner;
class Main {
	int H,W,x,y,a,b;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		while(H != 0 || W != 0){
			for(x = 0;x != H;x++){
				for(y = 0;y != W;y++){
					a = x % 2;
					b = y % 2;
					if(b == 0){
						if(a == 0){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}else{
						if(a == 1){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}
				}
				System.out.println("");
			}
			System.out.println("");
			H = sc.nextInt();
			W = sc.nextInt();
		}
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}