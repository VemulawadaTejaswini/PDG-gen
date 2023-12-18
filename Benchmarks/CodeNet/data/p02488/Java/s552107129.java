import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
	Scanner s = new Scanner(System.in);
	
	String str, head = "zzzzzzzz";
      
	int n = s.nextInt();
	for(int i = 0 ; i < n ; i++){
	    
	    BufferedReader input =
		new BufferedReader(new InputStreamReader(System.in));
	    str = input.readLine();
	    if(str.compareTo(head) < 0) head = str;
	}
	System.out.println(head);
    }
}