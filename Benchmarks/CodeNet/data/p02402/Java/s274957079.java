import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//author : Chithanh
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????

		int total = 0 ;
	
	
		
		BufferedReader br= new BufferedReader ( new InputStreamReader ( System.in));
		 String str = br.readLine();
		 int n = Integer.parseInt(str) ;
		 
		 
		 
		 System.out.print("\n");
		 String st = br.readLine();
		 String [] stAry = new String[n];
		   stAry = st.split( " ");
		 int[] hensu = new int[n];
		 for ( int i = 0; i<n; i++){
			 hensu[i]= Integer.parseInt(stAry[i]);
		 }
		
		 
		 
		 
		 
		for (int i= 0; i<n;i++){
			total +=hensu[i];
			
		}
			
		Arrays.sort( hensu);
		
		System.out.print(hensu[0] + " "+ hensu[n-1]+ " "+total);
		  
		  
		}
		 		 
	
		

}