import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan= null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			while(scan.hasNext()){
				int h = scan.nextInt();
				int w = scan.nextInt();
				if((h == w) && h == 0)break;
				for(int i = 1; i <= h; i++){
					for(int j = 1;j <= w;j++){
						if( i == 1 || j == 1 || i == h || j == w)
							System.out.print("#");
						else
							System.out.print(".");
					}
					System.out.println();
				}
				System.out.println();
			}
		}finally{
			scan.close();
		}
	}
}