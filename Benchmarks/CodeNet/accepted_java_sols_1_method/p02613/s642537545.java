import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        HashMap<String,Integer> hmap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String s=br.readLine();
            hmap.put(s,hmap.getOrDefault(s,0)+1);
        }
        pw.println("AC x "+hmap.getOrDefault("AC",0));
        pw.println("WA x "+hmap.getOrDefault("WA",0));
        pw.println("TLE x "+hmap.getOrDefault("TLE",0));
        pw.println("RE x "+hmap.getOrDefault("RE",0));
        pw.flush();
        pw.close();
    }
}