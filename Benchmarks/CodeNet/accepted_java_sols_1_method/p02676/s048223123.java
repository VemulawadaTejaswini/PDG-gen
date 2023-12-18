import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	int K = sc.nextInt();
        String S = sc.next();
      
      	int len = S.length();
        if(len > K){
            String tmp = S.substring(0,K);
            System.out.println(tmp + "...");            
        }else{
            System.out.println(S);
        }
    }
}
