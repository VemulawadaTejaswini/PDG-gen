import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
class Main{
    public static void main(String args[]){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str;
	    ArrayList<Integer> in = new ArrayList<Integer>();
	    int out;
	    int n;
	    while(null != (str = br.readLine())){
		n = Integer.parseInt(str);
		if(n == 0){
		    System.out.println(in.get(in.size()-1));
		    in.remove(in.size()-1);
		}
		else
		    in.add(n);
	    }
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}