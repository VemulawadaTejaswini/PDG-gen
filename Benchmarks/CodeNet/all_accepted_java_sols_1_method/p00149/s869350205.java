import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            int [] r =new int[4];
            int [] l =new int[4];
            while(scan.hasNext()){
            float re =scan.nextFloat();
            float le =scan.nextFloat();
            if(re>=1.1)r[0]++;
            else if(re>=0.6&&re<1.1)r[1]++;
            else if(re>=0.2&&re<0.6)r[2]++;
            else r[3]++;
            if(le>=1.1)l[0]++;
            else if(le>=0.6&&le<1.1)l[1]++;
            else if(le>=0.2&&le<0.6)l[2]++;
            else l[3]++;
            }
            for(int i=0;i<4;i++)
            	System.out.println(r[i]+" "+l[i]);
        }
}