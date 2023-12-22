//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        String s[]=br.readLine().trim().split(" ");
        int L=Integer.parseInt(s[0])-1;
        int R=Integer.parseInt(s[1]);
        int D=Integer.parseInt(s[2]);

        System.out.println(R/D-L/D);
    }
}