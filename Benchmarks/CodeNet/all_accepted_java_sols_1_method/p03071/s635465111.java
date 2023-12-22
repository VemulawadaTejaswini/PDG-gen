import java.util.*;
public class Main {
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
	// 整数の入力
	int a = sc.nextInt();

  
     int b = sc.nextInt();
  		int  answer  = 0;
       
  		for (int i = 0; i< 2 ; i++){
        	if(a >= b){
               answer += a;
               a--;
            }else if(a < b ){
            	answer += b;
                b--;
            }
        }
  
  		System.out.println(answer);
  		
	}
}
