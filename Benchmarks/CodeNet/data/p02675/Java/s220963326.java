import java.util.Scanner;
class Main{
	public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    	int N = sr.nextInt();
        int f = N % 10;
        if(f==2 || f==4|| f==5 || f==7 || f==9)
        	System.out.println("hon");
        else if(f==0 || f==1 || f==6 || f==8)
        	System.out.println("pon");
        else 
        	System.out.println("bon");    
     }
}