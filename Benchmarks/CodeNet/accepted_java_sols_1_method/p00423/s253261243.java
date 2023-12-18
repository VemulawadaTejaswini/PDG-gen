import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            while (true){
            	int n =scan.nextInt();
            	if(n==0)break;
            	int a=0;
            	int b=0;
            	
            	for(int i=0;i<n;i++){
            		int sa=scan.nextInt();
                	int sb=scan.nextInt();
            	if(sa==sb){
            		a+=sa;
            		b+=sb;
            	}
            	else if(sa>sb)a+=sa+sb;
            	else b+=sa+sb;
            	}
            	System.out.println(a+" "+b);
            	
            }
        }
}