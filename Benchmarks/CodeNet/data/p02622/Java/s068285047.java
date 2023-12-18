import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	String S = sc.next(System.in);
      	String T = sc.next(System.in);
      
      	for(int i = 0 ; i <= S.length()-1 ; i++){
          	char c1 = S.charAt(i);
          	int count = 0;
          for(int j = 0 ; j <= T.length()-1 ; j++){
          	char c2 = T.charAt(j);
          	
            if(c1 != c2){
              String str3 = replace(c1,c2);
              count++;
            }else{ 
              
            }
      		System.out.println(count);
         }
       }
    }
}