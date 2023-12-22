import java.util.Scanner;
class Main {
	public void kami() {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int H2 = H;
		int W2 = W;
		int H3 = H - 2;
		while(H != 0 || W != 0){
			while(0 < H){
				if(H == 1 || H == H2){
					for(int i = 1; i <= W; i++){
						System.out.print("#");
					}
					System.out.println();
				}else{
					
					while(0 < H3){
						System.out.print("#");
						for(int i = 1; i <= W2 - 2; i++){
							System.out.print(".");
						}
						System.out.println("#");
						H3--;
					}
					
				}
				H--;
				
			}
			System.out.println();
			H = sc.nextInt();
			W = sc.nextInt();
			H2 = H;
			W2 = W;
			H3 = H - 2;
		}
		
	}

	public static void main(String[] args) {

		new Main().kami();
	}

}