import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	int n;
    	int senCount=0;
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
	
    	if((n%1000)!=0){
        	int amari=1000-(n%1000);
        	System.out.println(amari);
    	}else{
    	    System.out.println(0);
    	}
	}
}