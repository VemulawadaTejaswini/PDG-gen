import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    int n = Integer.parseInt(str);
	    double init = 100000;
	    for(int i=0;i<n;i++){
		init = init * 1.05;
		if((init / 1000) % 1 > 0){
		    init = (init/1000 - ((init / 1000) % 1) + 1)*1000;
		}
	    }
	    System.out.printf("%d\n",(int)(init));
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}