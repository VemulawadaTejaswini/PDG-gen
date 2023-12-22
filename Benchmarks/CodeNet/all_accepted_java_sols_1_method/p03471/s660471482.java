import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt(); 
      int b = sc.nextInt(); 

        
        for(int i = 0; i <= a ; i++ ){
            for(int j = 0; j <= (a-i) ; j++){
                for(int k = 0; k <= (a-i-j) ; k++){
                    if(10000 * i + 5000 * j + 1000 * k == b && i + j + k == a){
                        System.out.println(i+" "+j+" "+k);
                        return;
                    }
                }
            }
        } 
        System.out.println("-1 -1 -1");    
  }    
}