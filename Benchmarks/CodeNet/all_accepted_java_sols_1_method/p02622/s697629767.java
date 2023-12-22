import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String T = scan.next();
        int count = S.length();
        
        for(int i=0;i<S.length();i++){
            if(Objects.equals(S.substring(i, i+1), T.substring(i, i+1))){
                count-=1;
            }
        }

        System.out.println(count);
    }
}