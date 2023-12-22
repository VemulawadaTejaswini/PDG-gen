import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int h,w,i,j;
		boolean state = false;
		h = sc.nextInt();
		w = sc.nextInt();
		while(h != 0 && w != 0){
			for(i = 0; i < h; i++){
				if(i % 2 == 0){
					state = false;
				}else{
					state = true;
				}
				for(j = 0; j < w; j++){
					if(!state){
						System.out.print("#");
						state = true;
					}else{
						System.out.print(".");
						state = false;
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