import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[])throws IOException{
		int sum=0;
		
        BufferedReader input =
                new BufferedReader (new InputStreamReader (System.in));
        String str = input.readLine( );
        if(Integer.parseInt(str)==0)return;
        for(int i=0;i<str.length();i++){
        	sum += Integer.parseInt(""+str.charAt(i)+"");
        }
        System.out.print(""+sum+"\n");
        return;
	}
}