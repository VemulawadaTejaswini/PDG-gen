import java.io.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        int k=0;
        if(n<600) k=8;
        else if(n<800) k=7;
        else if(n<1000) k=6;
        else if(n<1200) k=5;
        else if(n<1400) k=4;
        else if(n<1600) k=3;
        else if(n<1800) k=2;
        else k=1;
        System.out.print(k);
    }
}