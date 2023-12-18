import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = br.readLine();
			int n = Integer.parseInt(buf);
			int i = 1;
			do{
			//CHECK_NUM:
				int x = i;
				//System.out.print(" x:"+x+" ");
				if( x % 3 == 0 ){
					System.out.print(" "+i);

			//INCLUDE3:
				}else if( x % 10 == 3 ){
					System.out.print(" "+i);
				}else {
					x/=10;
					for(;x % 10==3;){
						System.out.print(" "+i);
						break;
					}
				}
			//END_CHECK_NUM
				if(++i >= n){
					if(100>i)	System.out.println(" "+i);
					break;
				}

			}while(true);

		} catch (IOException e) {
			System.err.println(e);
		}
	}

}