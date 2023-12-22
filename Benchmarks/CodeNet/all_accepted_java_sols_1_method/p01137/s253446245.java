import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
    	Scanner sc= new Scanner(System.in);
    	int x1,x2,x3;
    	int e;
    	while( (e= sc.nextInt())>0 ){
    		int min= e;
            for(x3= 0; x3*x3*x3<= e; x3++){
            }
            for(x3--; x3>=0; x3--){
            	int e_rem= e-x3*x3*x3;
                x2= (int)Math.sqrt(e_rem);
                x1= e_rem- x2*x2;
                if( min > x1+x2+x3 ){ min= x1+x2+x3; }
            }
            System.out.println(min);
    	}
    }
}