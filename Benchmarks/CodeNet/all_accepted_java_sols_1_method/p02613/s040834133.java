import java.io.*;
class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        int c1=0,c2=0,c3=0,c4=0;
        while(t-->0)
        {
            String s=bu.readLine();
            if(s.equals("AC")) c1++;
            if(s.equals("WA")) c2++;
            if(s.equals("TLE")) c3++;
            if(s.equals("RE")) c4++;
        }
        sb.append("AC x "+c1+"\n");
        sb.append("WA x "+c2+"\n");
        sb.append("TLE x "+c3+"\n");
        sb.append("RE x "+c4+"\n");
        System.out.print(sb);
    }
}