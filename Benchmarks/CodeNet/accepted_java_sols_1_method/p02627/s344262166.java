import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[]ss = S.toCharArray();
        
        if(ss[0]-0<91){
            System.out.println('A');
        }else{
        System.out.println('a');
        }
    }         
}
