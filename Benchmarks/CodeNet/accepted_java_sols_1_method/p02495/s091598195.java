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
				for(int i = 0; i < h; i++){
					for(int j = 0;j < w;j++){
						if((i+j) % 2 == 0)
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