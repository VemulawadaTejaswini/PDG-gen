import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);


        while(true){

        	int n = scan.nextInt();
        	if(n==0)break;
        if( n==6 || n ==28 || n == 496 || n==8128 || n==33550336)
        	System.out.println("perfect number");
        else if(n>fuctor_sum(n))System.out.println("deficient number");
        else System.out.println("abundant number");
        
        }
    }
    public static int fuctor_sum(int n){
    	int sum=0;

    	for(int i=1;i<n;i++){
    		if(n%i ==0){sum+=i;
    		if(sum>n)return n+1;
    		}
    	}
    	return sum;
    }
}