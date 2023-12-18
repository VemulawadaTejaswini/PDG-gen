import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int a=0;
        for(int i=0;i<3;i++){
            if(S.charAt(i)=='1'){
                a++;
            }
        }
        System.out.println(a);


}
        
        
    }
