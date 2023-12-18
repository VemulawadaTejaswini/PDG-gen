
import java.util.*;
  
class Main{
   public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    int w = input.nextInt();//長方形横
	int h = input.nextInt();//長方形たて
	int x = input.nextInt();//円の中心座標横軸
	int y = input.nextInt();//円の中心座標縦軸
	int r = input.nextInt();//円の半径
   	int inputhightforcircle = (y + r);//円の範囲縦方向
   	int inputwideforcircle = (x + r);//円の範囲横方向
   	
   	if(inputhightforcircle <= h &&
   		inputwideforcircle <= w &&
   		inputhightforcircle > 0 &&
   		inputwideforcircle > 0 && 
   		h > 0 && h <= 100 &&
   		w > 0 && w <= 100 &&
   		r > 0 && r <= 100){
   			
     	System.out.println("Yes");
   	}else{
   		System.out.println("No");
   	}
   	
  }
}