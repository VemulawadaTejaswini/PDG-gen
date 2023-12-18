import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
    String s=buf.readLine();
    String[] x=s.split(" ");
    int a=Integer.parseInt(x[0]);
    int b=Integer.parseInt(x[1]);
    int c=Integer.parseInt(x[2]);
    
    if(a<b){
        if(b<c)
        System.out.println("Yes");
    }
    else
        System.out.println("No");
    }
    }