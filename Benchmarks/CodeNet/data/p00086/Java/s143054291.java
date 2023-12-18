import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = null;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
			int[] cross = new int[101];
			while( stdIn.hasNext() ){
				int n = stdIn.nextInt(), m = stdIn.nextInt();
				while( n != 0 || m != 0 ){
					cross[n]++;
					cross[m]++;
					n = stdIn.nextInt();
					m = stdIn.nextInt();
				}
				if( cross[1] == 1 ){
					cross[1] = 0;
				}
				if( cross[2] == 1 ){
					cross[2] = 0;
				}
				boolean flag = true;
				for(int i = 0; i < cross.length; i++){
					if( cross[i]%2 != 0 ){
						flag = false;
					}
				}
				if( flag ){
					System.out.println("OK");
				} else {
					System.out.println("NG");
				}
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}