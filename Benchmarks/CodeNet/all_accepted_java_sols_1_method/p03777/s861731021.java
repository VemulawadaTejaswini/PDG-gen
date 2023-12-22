import java.util.*;
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
      	char b = sc.next().charAt(0);
      
      	if(a=='D'&&b=='D'){
        	System.out.println("H");
        }else if(a=='D'&&b=='H'){
        	System.out.println("D");
        }else if(a=='H'&&b=='H'){
        	System.out.println("H");
        }else{
        	System.out.println("D");
        }
    }
}