import java.util.Scanner;
public class Main {
public static void main(String[] args){
		
		{
	         int a,b ;
	         
	      
	         Scanner sc = new Scanner(System.in);
	         
	     
		a = sc.nextInt();
        b = sc.nextInt();
	
        int d=a/b;
        int r=a%b;
        double f=(double)a/(double)b;
   
        System.out.printf(d+" "+r+" "+"%.8f",f);
     
        sc.close();
	}
	}
}
	

