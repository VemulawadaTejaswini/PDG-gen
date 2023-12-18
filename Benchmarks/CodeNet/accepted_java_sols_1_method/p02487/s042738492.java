import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h == 0 && w ==0)break;     // h と w が共に 0 のとき
			for (int i = 0; i < h; i++){
				for(int k = 0; k < w; k++){
					if(i == 0 || i == h-1 || k == 0 || k == w-1){   // i が 0、 h-1、 k が 0、 w-1のどれかであるとき   
						System.out.print("#");          // # を出力
					}else{                              // その他のとき
						System.out.print(".");          // . を出力
		            }     
		         }
				System.out.println("");
			}
			System.out.println("");
		}
	}

}