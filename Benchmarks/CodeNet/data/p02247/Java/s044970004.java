import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String P = sc.next();
        for(int i = 0 ; i <= T.length() - P.length() ; i++){
            for(int j = 0 ; j < P.length() ; j++){
                if(!(T.charAt(i+j) == P.charAt(j)))
                    break;
                if(j == P.length()-1)
                    System.out.println(i);
            }
        }
    }
}
