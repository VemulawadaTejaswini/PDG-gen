import java.io.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int a=Integer.parseInt(s[0]),b=Integer.parseInt(s[1]),c=Integer.parseInt(s[2]);
        int k=Integer.parseInt(bu.readLine());
        while(k!=0 && b<=a) {b*=2; k--;}
        while(k!=0 && c<=b) {c*=2; k--;}
        if(a<b && b<c && k>=0) sb.append("Yes\n");
        else sb.append("No\n");
        System.out.print(sb);
    }
}