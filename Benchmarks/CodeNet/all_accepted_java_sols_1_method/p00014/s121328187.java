import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str;
	    int d;
	    int sum = 0;
	    while(null != (str = br.readLine())){
		d = Integer.parseInt(str);
		for (int i = 1; i*d<600; i++) {
		    sum += i*d*d*i*d;
		}
		System.out.println(sum);
		sum = 0;
	    }
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}