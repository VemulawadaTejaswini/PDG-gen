import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);


        while(true){

        	int n = scan.nextInt();
        	if(n==0)break;
     int s=fuctor_sum(n);
     	if(n==s)
        	System.out.println("perfect number");
        else if(n>s)System.out.println("deficient number");
        else System.out.println("abundant number");
        
        }
    }
    public static int fuctor_sum(int n){
    	int sum=-n;

    	for(int i=1;i*i<=n;i++){
    		if(n%i ==0){sum+=i+n/i;
    		if(i==n/i)sum-=i;
    		if(sum>n)return n+1;
    		}
    	}
    	return sum;
    }
}