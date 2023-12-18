import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
	
		String[] strAry = str.split(" ");

		int ar[] = new int[5];

		for(int i=0;i<5;i++){
			ar[i] = Integer.parseInt(strAry[i]);
		}

		int W = ar[0];
		int H = ar[1];
		int x = ar[2];
		int y = ar[3];
		int r = ar[4];

		if( x >= r && x <= W-r){
				if( y >= r && y <= H-r){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
		}else{
				System.out.println("No");
		}

	}
}