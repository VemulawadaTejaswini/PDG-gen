import java.io.*;

public class Main{
	public static void main (String[] args) {
	    int x, x1=1;
	    try{
		//System.out.println("input number 1<x<100");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		x = Integer.parseInt(br.readLine());
		if(x <= 100 && x>= 1){
		for(int i=0; i<x; i++){
		x1 = x1 * x;
		}
		System.out.println(x1);
		}else{
		//System.out.println("Input Error");
		}
	    }catch(IOException e){
	    //System.out.println("KUSO key bord");
	    }

	}
}