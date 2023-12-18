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
				for(int i = 1 ;i <= h;i++){
					boolean bool = i%2 == 1?true:false;
					for(int j = 1 ; j <= w;j++){
						if(bool){
							System.out.print("#");
							bool = false;
						}else{
							System.out.print(".");
							bool = true;
						}
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