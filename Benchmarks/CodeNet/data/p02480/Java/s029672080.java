import java.io.*;

public class Main
{
    public static void main (String args[]) throws IOException         //ツ（ツ４ツ）
    {
        InputStreamReader is = new InputStreamReader(System.in);       //ツ（ツ１ツ）
        BufferedReader br = new BufferedReader(is);                    //ツ（ツ２ツ）

        String str = br.readLine();                                    //ツ（ツ３ツ）
	int answer = Integer.parseInt(str);
	answer = answer*answer*answer;
	str = String.valueOf(answer);
	System.out.println(str);

    }
}