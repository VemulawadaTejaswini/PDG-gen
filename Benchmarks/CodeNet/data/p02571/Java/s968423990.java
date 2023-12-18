import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String S=sc.next();
    
    String T=sc.next();
    
    
    int res=T.length();
      
    for(int i = 0; i< S.length(); i++){
        int count = 0;
        
        for(int j = 0;j< T.length(); j ++){
            
            if(S.charAt(i) != T.charAt(j)){
                count ++;
            }
        }
        res = Math.min(res,count);
    }
     System.out.println(res);
    
    }
}