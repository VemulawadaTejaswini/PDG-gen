import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int H, W;
		String str = null;
		String[] input = new String[2];
		int i, j;

		while(true){
			str = scan.nextLine();
			input = str.split(" ");

			H = Integer.parseInt(input[0]);
			W = Integer.parseInt(input[1]);

			if(3 <= H && 3 <= W){
				for(i=0; i<H; i++){
					for(j=0; j<W; j++){
						if(j==0 || j==(W-1)){
							System.out.print("#");
						}
						else if(i==0 || i==(H-1)){
							System.out.print("#");
						}
						else{
							System.out.print(".");
						}
					}
					System.out.println();
				}
				System.out.println();
			}
			if (H==0 && W==0){
				break;
			}
		}

	}
}
