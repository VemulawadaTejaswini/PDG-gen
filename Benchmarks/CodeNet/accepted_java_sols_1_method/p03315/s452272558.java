import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[]s = S.toCharArray();
 
        int purasu=0;   
        for(int i=0; i<4; i++){
            if(s[i]=='+'){
                purasu++;               
            }
}
        int mainasu = 4-purasu;
        
    System.out.println(purasu-mainasu);
      }
}
