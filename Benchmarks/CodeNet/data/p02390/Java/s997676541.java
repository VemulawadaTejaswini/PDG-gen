import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner kb = new Scanner( System.in);
		
		int S = kb.nextInt();
		
		int h=S/3600;
		S=S%3600;
		int m=S/60;
		int s=S%60;
    	
        System.out.println( h+":"+m+":"+":"+s+"\n" );
    }
}