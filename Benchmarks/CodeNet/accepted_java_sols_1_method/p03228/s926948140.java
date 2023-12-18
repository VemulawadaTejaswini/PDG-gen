import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      	int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int chenge = 0;
      	
        while(k != 0){
          if(chenge == 0){
         	 if(a % 2 == 1){
            	a--;
         	 }
         	 b = b + a / 2;
         	 a = a / 2;
             chenge = 1;
          }else{
             if(b % 2 == 1){
                b--; 
             }
             a = a + b / 2;
             b = b / 2;
             chenge = 0;
          }
            
          k--;
        }
      
          System.out.println(a);
          System.out.println(b);
      
    }
}