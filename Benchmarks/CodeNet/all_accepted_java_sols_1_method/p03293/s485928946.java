import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
                String l = s.next();
                String m = s.next();
                int[] a = new int[3];
                int[] b = new int[100];
                int i=0,j=0,t=0;
                float sum1=0;
                int r= l.length();
                int k= m.length();
                if(r==k){
                    for(i=0;i<r;i++){
                       String gf = l.substring(i,i+1);
                       String d = l.substring(0,i);
                       String gg = l.substring(i+1);
                       String c= gf + gg + d;
                       if(c.equals(m)){
                         t=1;
                       }
                      // System.out.println(c);
                    }
                }
                
                if(t==1){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
               
                
	}
}