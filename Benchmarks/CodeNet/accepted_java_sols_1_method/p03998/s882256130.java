import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String SA = sc.next();
        String SB = sc.next();
        String SC = sc.next();
        
        int counta= -1;
        int countb= -1;
        int countc= -1;
        int idx = 0;
        boolean judge =true;
        
        while(judge){
            if(idx == 0){
                counta++;
                if(counta == SA.length()){
                    break;
                }
                if(SA.charAt(counta) == 'b'){
                    idx = 1;
                }else if(SA.charAt(counta) == 'c'){
                    idx = 2;
                }
        }else if(idx == 1){
                countb++;
                if(countb == SB.length()){
                    break;
                }
                if(SB.charAt(countb) == 'a'){
                    idx = 0;
                }
                else if(SB.charAt(countb) == 'c'){
                    idx = 2;
                }
            }else{
                countc++;
                if(countc == SC.length()){
                    break;
                }
                if(SC.charAt(countc) == 'a'){
                    idx = 0;
                }else if(SC.charAt(countc) == 'b'){
                    idx = 1;
                }
            }
        }
        
        if(counta == SA.length()) System.out.println("A");
        if(countb == SB.length()) System.out.println("B");
        if(countc == SC.length()) System.out.println("C");
        
    }
}
