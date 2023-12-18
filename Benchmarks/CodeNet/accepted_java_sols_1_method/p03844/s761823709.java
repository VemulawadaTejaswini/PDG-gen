import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        String S=sc.next();
        int B=sc.nextInt();
        if(S.charAt(0)=='+'){
            System.out.println(A+B);
        }else{
            System.out.println(A-B);
        }
        
}
        
        
    }
