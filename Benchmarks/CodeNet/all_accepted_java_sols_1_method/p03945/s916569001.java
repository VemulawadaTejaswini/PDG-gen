import java.util.*;
    
public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
     
    String s = sc.next();
    int cnt =0;
 
    if(s.length()>1){
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                cnt++;
            }
        }
    }
    
    System.out.println(cnt);
	sc.close();
    }
}
