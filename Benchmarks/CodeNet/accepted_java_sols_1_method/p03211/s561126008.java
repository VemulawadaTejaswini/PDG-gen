import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		String str = sc.next();
      	int min = 753;
      	for(int i = 0; i+2 < str.length(); i++){
      	int ans = Math.abs(Character.getNumericValue(str.charAt(i))*100 
          + Character.getNumericValue(str.charAt(i+1))*10 
          +Character.getNumericValue(str.charAt(i+2))
          - 753);
          if(min>=ans){
            min = ans;
          }
        }
      	System.out.println(min);
    }
}