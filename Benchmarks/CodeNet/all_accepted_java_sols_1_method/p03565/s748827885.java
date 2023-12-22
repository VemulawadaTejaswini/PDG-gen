import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String S = sc.next();
        String T = sc.next();
        int ls = S.length();
        int lt = T.length();
        String a = "?";

        if(ls<lt){
            System.out.println("UNRESTORABLE");
            return;
        }
        int x = -1;
        for(int i=0; i<=ls-lt; i++){
            if(S.charAt(i)==T.charAt(0) || S.charAt(i)==a.charAt(0)){
                for(int j=0; j<lt; j++){
                    if(S.charAt(i+j)!=T.charAt(j) && S.charAt(i+j)!=a.charAt(0)){
                        break;
                    }
                    if(j==lt-1){
                        x = i;
                    }
                }
            }
        }
        if(x==-1){
            System.out.println("UNRESTORABLE");
            return;
        }
        else if(ls==lt){
            S = T;
            System.out.println(S);
            return;
        }
        else if(x==0){
            S = T + S.substring(lt);
        }
        else if(x!=0){
            if(x+lt-1==ls){
                S = S.substring(0, x) + T;
            }
            else{
                S = S.substring(0, x) + T + S.substring(x + lt);
            }
        }
        String st = "";
        for(int i=0; i<ls; i++){
            if(S.charAt(i)==a.charAt(0)){
                st += "a";
            }
            else{
                st += String.valueOf((char)S.charAt(i));
            }
        }
        System.out.println(st);
    }
}