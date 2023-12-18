import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        
        int tmp = 0;
        int max = 0;
        for(int i = T.length(); i >= 0; i--){
          if(S.contains(T.substring(0,i))){
            tmp = i;
          }
          if(max < tmp){
            max = tmp;
          }
        }
        
        if(max == 0){
          for(int i = 0; i < t.length; i++){
            String temp = String.valueOf(t[i]);
            if(S.contains(temp)){
              max = 1;
            }
          }
        }
        System.out.println(T.length()-max);
     
	}
}