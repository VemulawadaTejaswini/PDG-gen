import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		 String num;
		 int S;
		 int M;
		 int s;
		 int H;
		  try{
			  System.out.println("??°????????\????????????????????????");
			   num = input.readLine();
			  S=Integer.parseInt(num);
			  System.out.println(S+"?§???§??????");
			  H=S/3600;
			  M=S%3600/60;
			  s=S%3600%60;

			  System.out.println(H+":"+M+":"+s);

		    }catch(IOException e)
		    {   System.out.println("Exception : " + e);
		    }


	}

}