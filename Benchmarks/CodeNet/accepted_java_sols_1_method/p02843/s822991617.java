import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x = sc.nextInt();
      	int y = x / 100;
        int z = x % 100;
        int i;
        if(z == 0){
          System.out.println(1);  
          System.exit(0);
        }
      	for(i = 1;i <= y; i++){
          if(z >= 5){
            z -= 5;
          }else if(z >= 4){
            z -= 4;
          }else if(z >= 3){
            z -= 3;
          }else if(z >= 2){
            z -= 2;
          }else if(z >= 1){
            z -= 1;
          }
        }
    	if(z == 0){
           System.out.println(1);  
        }else{
           System.out.println(0);  
        }
    }
}