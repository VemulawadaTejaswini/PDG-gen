import java.util.*;
import java.io.*;

class Main{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    	for(int i=0; i<9; i++){
         String team =sc.next();
         int am=sc.nextInt();
         int pm=sc.nextInt();
         System.out.println(team+" "+(am+pm)+" "+(am*200+pm*300));
    	}    	
	}
	}