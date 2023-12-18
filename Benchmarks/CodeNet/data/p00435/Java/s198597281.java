import java.math.BigInteger;
import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            char [] cs = scan.next().toCharArray();
            for(int i=0;i<cs.length;i++){
            	if(cs[i]>='D')cs[i]-=3;
            	else cs[i]+=23;
            }
            System.out.println(cs);
        }
}