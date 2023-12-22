import java.util.*;
public class Main {
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   String str = sc.next();
      
      if(str.length()==1 && !str.equals("@")){
 
      if(Character.isUpperCase(str.charAt(0))){
      	str = "A";
      }else{
        str = "a";
      }
		// 出力
		System.out.println(str);     
	}
        
      }
}