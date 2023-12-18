
import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
       
        final Scanner sc = new Scanner(System.in);

        ArrayList<String>  allmen =new ArrayList <String>(){{}};
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int bigNum =11;
        Long alf = 26l;
        Long N = sc.nextLong();
        String ans = "";
        
        for(int i=bigNum;N>0;i--){
            Long targetNum = N-1;
            int targetStr = (int)(targetNum%alf);
            ans = abc.substring(targetStr,targetStr+1)+ans;
            N =  targetNum/alf;
        }


        System.out.println(ans);

    }
}
    


    