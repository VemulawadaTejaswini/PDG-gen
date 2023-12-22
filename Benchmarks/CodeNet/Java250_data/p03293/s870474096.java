import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int num =0;
        if(S.equals(T)){
            num=1;
            System.out.println("Yes");
        }
        else{
            for(int i=1;i<S.length();i++){
                String Index = S.substring(0,i);
                String last = S.substring(i);
                String con = last + Index;
                if(con.equals(T)){
                    System.out.println("Yes");
                    num=1;
                    break;
                }
            }
        }
        if(num==0) System.out.println("No");
    }
}
