import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[]ss = S.toCharArray();

        int cou = 0;
        int C = 0;
        for(int i=2; i<S.length()-1; i++) {
        	if(ss[i] == 'C') {
        		C++;
        	}
        }
        for(int i=0; i<S.length(); i++) {
        	if(ss[i]>96) {
        		cou++;
        	}
        }
        
        if(ss[0]=='A' && C==1 && cou==S.length()-2){
            System.out.println("AC");    
        }else{
            System.out.println("WA");
    }
}
}
