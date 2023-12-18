import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int h,w,i,j,state;
		h = sc.nextInt();
		w = sc.nextInt();
		while(h != 0 && w != 0){
			state = 0;
			for(i = 0; i < h; i++){
				for(j = 0; j < w; j++){
					if(!state){
						System.out.print("#");
						state = 1;
					}else{
						System.out.print(".");
						state = 0;
					}
				}
				System.out.println("");
			}
			System.out.println("");
			h = sc.nextInt();
			w = sc.nextInt();
		}
	}
}