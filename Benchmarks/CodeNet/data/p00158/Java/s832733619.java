import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
       
        while(true){
        	int n = scan.nextInt();
        	if(n==0)break;
        	System.out.println(collatz(n,0));
        	

        }
    }
    public static int collatz(int n,int c){
    	if(n==1)return c;
    	
    	if(n%2==0)return collatz(n/2,c+1);
    	else return collatz(3*n+1,c+1);
    }
}