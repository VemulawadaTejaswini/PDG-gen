import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{

	public static void main(String[] args) throws IOException
	{
		int n,nTaro=0,nHana=0;
		String str;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
        n = Integer.parseInt(br.readLine() );
        
        for(int i=0; i<n; i++)
        {
            str = br.readLine();
            
            String[] strTH = str.split(" ",2);
            
            if(0 < strTH[0].compareTo(strTH[1]) ) nTaro += 3;
            else if(strTH[0].equals(strTH[1]) )
            {
                nTaro++;
                nHana++;
            }
            else nHana += 3;
            
        }
        
        System.out.println(nTaro + " " +nHana);
            
	}
}