import java.io.*;
import java.util.*;
import java.lang.reflect.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   

    private static StringTokenizer st;

    public static void main ( String [] args ) throws IOException
    {
	    new Main().cal();
	
    }



    private void cal() throws IOException 
    {
     while(true){
     st= new StringTokenizer(br.readLine());
     int n = Integer.parseInt(st.nextToken());
     int a = Integer.parseInt(st.nextToken()); 
     int b = Integer.parseInt(st.nextToken());  
     if( n == 0 && a == 0 && b == 0) break;

	int[] save = new int[1000000];
	int saveInd = 0;

	boolean check;
	//save
	for( int i= 0; i< n;i++){
		if( a*i > n ) break;
	for( int j=0; j< n; j++){
		int temp = a*i+ b*j;
		if( i == 0 && j == 0) continue;
		if( temp > n ) break;
		check = true;
		for( int l =0; l < saveInd; l++){
			if( temp == save[l] ){
				check = false;
				break;
			}
		}
		if( check ){
			save[saveInd++] = temp;
		}
	}
	}


	System.out.println(n-saveInd);
    	
    }
   }
}