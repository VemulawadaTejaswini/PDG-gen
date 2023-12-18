import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
    while(sc.hasNext()){
    	int n=sc.nextInt();
    	for(int i=0;i<10;i++){
    		if(n%2==1){
    		    System.out.print((int)Math.pow(2, i));
    		    if(n!=1)System.out.print(" ");
    		}
    		if(n==1)break;
    		n/=2;
    }
    System.out.println();
    }
    }
}