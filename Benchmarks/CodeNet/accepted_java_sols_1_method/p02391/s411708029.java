import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
	    StringTokenizer st =
	    		new StringTokenizer(str, " ");
	    
	    String str1 = st.nextToken(); 
	    String str2 = st.nextToken();
	    
	    int num1 = Integer.parseInt(str1);
	    int num2 = Integer.parseInt(str2);
	    
	    if(num1<num2)
	    	System.out.println("a < b");
	    else if(num1>num2)
	    	System.out.println("a > b");
	    else
	    	System.out.println("a == b");    
	    
	    
	}

}