import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String O = sc.nextLine();
        String E = sc.nextLine();
        int cunt = 0;

        String[] ansO =  O.split("");
        String[] ansE =  E.split("");

        if(O.length() < E.length()){
            cunt = E.length();
        }else{
            cunt = O.length();
        }

        for(int i=0; i<cunt; i++){
            if(i < E.length() && i < O.length()){
                System.out.print(ansO[i] + ansE[i]);
            }else if(i == E.length()){
                System.out.print(ansO[i]);
            }else if(i == O.length()){
                System.out.print(ansE[i]);
            }
        }
    }
}