import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = "";
      
		for(int i=0; i<S.length(); i++){
			String str = String.valueOf(S.charAt(i));
			if(str.equals("0")){
				ans += "0";
            }else if(str.equals("1")){
				ans += "1";
            }else {
				if(!(ans.isEmpty())){
					ans = ans.substring(0, ans.length()-1);
                }
            }
        }
					
		
		System.out.println(ans);
    }
}
