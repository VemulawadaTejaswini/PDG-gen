import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[])throws IOException{
		int[] sum = new int[100];
		String[] str = new String[100];
		int max=0;
		
        BufferedReader input =
                new BufferedReader (new InputStreamReader (System.in));
        for(int i=0;;i++){
	        str[i] = input.readLine( );
	        if(Long.parseLong(str[i])==0){
	        	max=i;
	        	break;
	        }
        }
        for(int j=0;j<max;j++){
	        for(int i=0;i<str[j].length();i++){
	        	sum[j] += Long.parseLong(""+str[j].charAt(i)+"");
	        }
        	System.out.print(""+sum[j]+"\n");
		}

        return;
	}
}