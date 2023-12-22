import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
class Main{
    public static void main(String args[]){
	try{
	    InputStreamReader is = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(is);
	    String str = br.readLine();
	    char[] cary = str.toCharArray();
	    for(int i=(cary.length-1);i>=0;i--){
		System.out.print(cary[i]);
	    }
	    System.out.print("\n");

	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}