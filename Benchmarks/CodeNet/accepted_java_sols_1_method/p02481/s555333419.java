import java.io.*;

public class Main
{
    public static void main (String args[]) throws IOException         //ツ（ツ４ツ）
    {
        InputStreamReader is = new InputStreamReader(System.in);       //ツ（ツ１ツ）
        BufferedReader br = new BufferedReader(is);                    //ツ（ツ２ツ）

        String str = br.readLine();                                    //ツ（ツ３ツ）
	int space = str.indexOf(" ");
	String str1 = str.substring(0, space);
	String str2 = str.substring(space+1, str.length());
	int n = Integer.parseInt(str1);
	int m = Integer.parseInt(str2);
	int mult = n*m;
	int syuui = 2*n + 2*m;
	System.out.println(mult+ " " +syuui);


    }
}