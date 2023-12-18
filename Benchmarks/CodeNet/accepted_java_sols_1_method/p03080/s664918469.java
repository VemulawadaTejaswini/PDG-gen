import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      	String k = sc.next();
		String hat[] = k.split("");
        int i;
        int ans = 0;
        for(i = 0;i < n;i++){
          if(hat[i].equals("R")){
            ans++;
          }else{
            ans--;
          }
        }
      if(ans > 0){
            System.out.println("Yes");   
      }else{
        	System.out.println("No"); 
      }
 
 
    }
}