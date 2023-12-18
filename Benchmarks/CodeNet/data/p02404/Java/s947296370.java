import java.util.Scanner;

public class Main{
	public static void main(String[] arg){
		//データの入力の準備
		Scanner sc  = new Scanner(System.in);
		
		while(true){
			//データの入力
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if(h == 0 && w == 0){
				break;
			}
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(i == 0 || i == h - 1 || j == 0 || j == w -1){
						System.out.print('#');
					}else{
						System.out.print('.');
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}
