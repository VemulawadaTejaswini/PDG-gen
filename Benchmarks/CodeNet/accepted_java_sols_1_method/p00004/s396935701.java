import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
	String str;
	try{
	    InputStreamReader is = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(is);
	    int[] n = new int[6];
	    double x,y;
	    str = br.readLine();
	    while(str !=null){
		String[] strary = str.split(" ");
		for(int i=0;i<6;i++){
		    n[i] = Integer.parseInt(strary[i]);
		}
		x=(n[2]*n[4]-n[1]*n[5])/(double)((n[0]*n[4]-n[1]*n[3]));
		y=(n[0]*n[5]-n[2]*n[3])/(double)((n[0]*n[4]-n[1]*n[3]));
		if(x == -0.0)
		    x = 0.0;
		if(y == -0.0)
		    y = 0.0;
		System.out.printf("%4.3f %4.3f\n",x,y);
		str = br.readLine();
	    }
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}