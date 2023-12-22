import java.util.Arrays;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {




		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		String[] s = new String[H];
		boolean[] x = new boolean[W];
		boolean[] y = new boolean[H];

		Arrays.fill(x, false);
		Arrays.fill(y, false);

		


		for(int i= 0;i < H;i++){
			s[i] = scan.next();
		}

		for(int i= 0;i <H;i++){
			for(int j=0;j < W;j++){
				if(s[i].charAt(j) == '#'){
					x[j] = true;
					y[i] = true;
				}
			}
		}
		
	


		for(int i= 0;i <H;i++){
			if(y[i]){
				for(int j=0;j < W;j++){
					if(x[j]){
						System.out.print(s[i].charAt(j));
					}
				}
				System.out.println();
			}
		}




	}



}
