import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      
        int count = 1,tmp;
        int brick = 0;
        for(int i = 0;i<n;i++){
          tmp = sc.nextInt();
          if(tmp == count){
            count += 1;
          }else{
            brick += 1;
          }
        }
        if(count == 1){brick = -1;}
        System.out.println(brick);
        

        
    }
}