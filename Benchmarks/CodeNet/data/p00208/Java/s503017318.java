import java.util.*;
import java.util.regex.*;
public class Main {

		public static int [] t ={0,1,2,3,5,7,8,9};
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            
            while(true ){
            	int n = scan.nextInt();
            	if(n==0)break;
            	f(n);
            	System.out.println();
        }
            
        }
        static void f(int n){
        	if(n>7)f(n/8);
        	System.out.print(t[n%8]);
        }
}