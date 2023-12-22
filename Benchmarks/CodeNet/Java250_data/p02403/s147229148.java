import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			int H = scanner.nextInt();
			int W = scanner.nextInt();
			if(H == 0 && W == 0){ break;}
			Print(H, W);
		}
		scanner.close();
	}
	
	
	public static void Print(int H , int W){
		for(int y = 0; y < H ; y++){
			for(int x = 0 ; x < W ; x++){
				System.out.print("#");
			}
			System.out.println("");
		}
                System.out.println("");
		return ;
	}

}