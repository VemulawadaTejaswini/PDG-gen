import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[]ss = S.toCharArray();

        int cou = 0;
        for(int i=0; i<S.length(); i++) {
        	if(ss[i] != ss[S.length() -1 - i]){ 	
        		cou++;
        	}
        }
       for(int i=0; i<(S.length()-1)/2; i++) {
            if(ss[i] != ss[(S.length()-1)/2 -1 - i]){ 	
                cou++;	
            }	
        }
       for(int i=(S.length()+5)/2-1; i<S.length(); i++) {
       	if(ss[i] != ss[S.length()-1 - i]){ 	
       		cou++;
       	}
       }
       
        if(cou == 0){
            System.out.println("Yes");    
        }else{
            System.out.println("No");
    }
}
}
