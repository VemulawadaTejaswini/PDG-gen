import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
    String f=x.readLine();
    String[] s=f.split(" ");
    int a,b;
    a=Integer.parseInt(s[0]);
    b=Integer.parseInt(s[1]);
    
    if(a == b)
        System.out.println("a == b");
    else if(a<b)
        System.out.println("a < b");
    else
        System.out.println("a > b");
    }
}