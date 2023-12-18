import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			while(true){
				int h,w;
				h = scan.nextInt();
				w = scan.nextInt();
				if(h == 0 && w == 0)break;
				for(int i = 0 ;i < h;i++){
					for(int j = 0 ; j < w;j++){
						System.out.printf("#");
					}
					System.out.println();
				}
				System.out.println();
			}
		}finally{
			if(scan != null)scan.close();
		}
	}
}