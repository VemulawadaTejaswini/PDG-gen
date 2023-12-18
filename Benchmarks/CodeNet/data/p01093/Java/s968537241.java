import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    while(true){
	    int parson=Integer.parseInt(reader.readLine());
	    if(parson==0)
		break;
	    String str=reader.readLine();
	    String s[]=str.split(" ");
	    int seiseki[]=new int[parson];
	    ArrayList<Integer> list=new ArrayList<>();

	    
	    
	    for(int i=0;i<parson;i++){
		seiseki[i]=Integer.parseInt(s[i]);
	    }

	    for(int i=0;i<parson;i++){
		for(int j=0;j<parson;j++){
		    if(i!=j){
			list.add(Math.abs(seiseki[i]-seiseki[j]));
		    }
		}
	    }
	    System.out.println(Collections.min(list));
	    }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int gcd (int a, int b){
	return b>0?gcd(b,a%b):a;
    }
    static int lcm (int a, int b) {
	return a*b/gcd(a,b);
    }
}

