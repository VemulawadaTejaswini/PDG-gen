import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
	String str;
	try{
	    InputStreamReader is = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(is);
	    str = br.readLine();
	    while(str !=null){
	    String[] strary = str.split(" ");
	    int n1 = Integer.parseInt(strary[0]);
	    int n2 = Integer.parseInt(strary[1]);
	    int sum = n1 + n2;
	    String s = Integer.toString(sum);
	    System.out.println((s.length()));
	    str = br.readLine();
	    }
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}