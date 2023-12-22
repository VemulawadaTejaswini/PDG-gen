import java.io.*;

public class Main{
	public static void main (String[] args) {
	    //long x;
	    long x1 = 1;
	    try{
		//System.out.println("input number 1<x<100");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		long x = Long.parseLong(br.readLine());
		if(x <= 100 && 1 <= x){
		for(int i=0; i<3; i++){
		x1 = (long)x1 * x;
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