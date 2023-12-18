import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int sheep = sc.nextInt();
        int wolf  = sc.nextInt();
        String ans = "";
      
        if(wolf < sheep){
          ans = "safe";
        }else{
          ans = "unsafe";
        }
        
      	System.out.println(ans);
 
    }
}