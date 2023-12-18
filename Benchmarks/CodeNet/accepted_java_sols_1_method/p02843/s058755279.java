import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x = sc.nextInt();
      	int y = x / 100;
        int d = x % 100;

      	for(int i = 1;i <= y; i++){
          if(d >= 5){
            d -= 5;
          }else if(d >= 4){
            d -= 4;
          }else if(d >= 3){
            d -= 3;
          }else if(d >= 2){
            d -= 2;
          }else if(d >= 1){
            d -= 1;
          }
        }
    	if(d == 0){
           System.out.println(1);  
        }else{
           System.out.println(0);  
        }
    }
}