import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
	while(true){
	    int sum = 0;
	    BufferedReader input =
		new BufferedReader(new InputStreamReader(System.in));
	    String str = input.readLine();
	    char s = str.charAt(0);
	    if(s == '0') break;
	    
	    for(int i = 0 ; i < str.length() ; i++){
		char c = str.charAt(i);
		int a = c - '0';
		sum += a;
	    }
	    System.out.println(sum);
	}
    }
}