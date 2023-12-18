import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.text.SimpleDateFormat;

 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	while(true){
	    String s[]=br.readLine().split(" ");
	    String gen=s[0];
	    if(gen.equals("#")){
		break;
	    }
	    int y=Integer.parseInt(s[1]);
	    int m=Integer.parseInt(s[2]);
	    int d=Integer.parseInt(s[3]);

	    if((y>=31&&m>=5)||(y>31)){
		gen="?";
		y-=30;
	    }

	    System.out.println(gen+" "+y+" "+m+" "+d);

	}
	
	br.close();
    }


    static int gcd (int a, int b){
	return b>0?gcd(b,a%b):a;
    }
    static int lcm (int a, int b) {
	return a*b/gcd(a,b);
    }
}

