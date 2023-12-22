import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] s = S.toCharArray();
        
        Arrays.sort(s);
      
        for(int i = 0; i < s.length; i++){
          int count = 0;
          for(int j = i; j < s.length; j++){
            if(s[i] == s[j]){
              count++;
            }
          }
         
          if(count % 2 != 0){
            System.out.println("No");
            return;
          }else{
            i += count-1;
            continue;
          }
        }
                  
          System.out.println("Yes");
        
	}
}