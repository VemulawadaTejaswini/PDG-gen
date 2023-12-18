import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String[] input = bf.readLine().split(" ");
			
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			
			int l0=0;
			int r0=100000;
			String in;
			
			while( (in = bf.readLine()) != null ){
				if ( in.trim().length() ==  0 ) break;
				input = in.split(" ");
				int l = Integer.parseInt(input[0]);
				if (l>l0) l0=l;
				int r = Integer.parseInt(input[1]);
				if (r<r0) r0=r;
			}
			if(r0-l0+1<0){
				System.out.println(0);
			}else{
				System.out.println(r0-l0+1);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}