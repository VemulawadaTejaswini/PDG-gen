//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        N=Integer.parseInt(br.readLine().trim());
        int c1=0,c2=0,c3=0,c4=0;
        for(i=0;i<N;i++)
        {
            String s=br.readLine().trim();
            if(s.equals("AC")) c1++;
            else if(s.equals("WA")) c2++;
            else if(s.equals("TLE")) c3++;
            else c4++;
        }

        System.out.println("AC x "+c1);
        System.out.println("WA x "+c2);
        System.out.println("TLE x "+c3);
        System.out.println("RE x "+c4);
    }
}