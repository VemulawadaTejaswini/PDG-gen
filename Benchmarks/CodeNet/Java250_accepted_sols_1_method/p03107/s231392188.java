import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] s = S.toCharArray();
        
        int ans = 0;
        for(int i = 1; i <= s.length-1; i++){
          if((s[i-1] == '0' && s[i] == '1')||(s[i] == '0' && s[i-1] == '1')){
            ans += 2;
            s[i-1] = '5';
            s[i] = '5';
          }
        }
      
         int count1 = 0;
         int count0 = 0;
         for(int i = 0; i < s.length; i++){
           if(s[i] == '1'){
             count1++;
           }else if(s[i] == '0'){
             count0++;
           }
         }
      
        if(count1 > count0){
          ans += count0*2;
        }else{
          ans += count1*2;
        }
          System.out.println(ans);
        
	}
}