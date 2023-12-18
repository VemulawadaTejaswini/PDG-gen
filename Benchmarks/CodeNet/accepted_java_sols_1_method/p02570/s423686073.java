import java.util.*;
 
public class Main{
		public static void main(String[] args){
       		Scanner ti = new Scanner(System.in);
            int d = ti.nextInt();
            int t = ti.nextInt();
            int s = ti.nextInt();
          	float c;
           	c = (float)d/(float)s;
            if(c <= t)
     			System.out.println("Yes");
            else
            	System.out.println("No");
       }	
}