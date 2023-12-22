import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true){
			int h = in.nextInt();
			int w = in.nextInt();
			if(h==0 && w==0) break;
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)) System.out.print("#");
					else System.out.print(".");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}