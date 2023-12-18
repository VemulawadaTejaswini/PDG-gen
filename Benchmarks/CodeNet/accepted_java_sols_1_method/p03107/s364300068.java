import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String h = sc.next();
        String brock[] = h.split("");
        int iti = 0,zero = 0;
        for(int i = 0;i < h.length();i++){
          if(brock[i].equals("1")){
            iti += 1;
          }else{
            zero += 1;
          }
        }
        if(iti <= zero){
          System.out.println(iti * 2);
        }else{
          System.out.println(zero * 2);
        }

        
    }
}