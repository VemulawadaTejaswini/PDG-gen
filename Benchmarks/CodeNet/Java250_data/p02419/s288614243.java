import java.util.Scanner;

class Main{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
        String W = sc.nextLine();
        int count = 0;

	while(true){
        String T = sc.next();
        if(T.equals("END_OF_TEXT"))
           break;
        
        	W= W.toUpperCase( );
        	T= T.toUpperCase( );
           if(T.equals(W))
           count++;
		}
           System.out.println(count);
	}
}
