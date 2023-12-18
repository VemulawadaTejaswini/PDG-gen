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
					if((k%2 ==0 && i%2 ==0)||(k%2 ==1 && i%2 == 1)){   // i と k が偶数のとき、 i と k が奇数のとき   
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