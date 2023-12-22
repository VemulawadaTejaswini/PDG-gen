import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int cnt=0;
	String pattern;
	
	String first = in.nextLine();
	while(in.hasNext()){
	    pattern = in.next();
	    if(pattern.equalsIgnoreCase(first))cnt++;
	    else if(pattern.equals("END_OF_TEXT"))break;
	}
	System.out.println(cnt);
    }
}
	    
	

